/**
 * 3. 크레인 인형뽑기(카카오)
 * 
 * 게임개발자인 죠르디는 크레인 인형뽑기 기계를 모바일 게임으로 만들려고 합니다.
 * 죠르디는 게임의 재미를 높이기 위해 화면 구성과 규칙을 다음과 같이 게임 로직에 반영하려고 합니다.
 * 게임 화면은 1 x 1 크기의 칸들로 이루어진 N x N 크기의 정사각 격자이며 위쪽에는 크레인이 있고 오른쪽에는 바구니가 있습니다.
 * 모든 인형은 1 x 1 크기의 격자 한 칸을 차지하며 격자의 가장 아래 칸부터 차곡차곡 쌓여 있습니다.
 * 게임 사용자는 크레인을 좌우로 움직여서 멈춘 위치에서 가장 위에 있는 인형을 집어 올릴 수 있습니다. 집어 올린 인형은 바구니에 쌓이게 되는 데,
 * 이때 바구니의 가장 아래 칸부터 인형이 순서대로 쌓이게 됩니다.
 * 만약 같은 모양의 인형 두 개가 바구니에 연속해서 쌓이게 되면 두 인형은 터뜨려지면서 바구니에서 사라지게 됩니다.
 * 크레인 작동 시 인형이 집어지지 않는 경우는 없으나 만약 인형이 없는 곳에서 크레인을 작동시키는 경우에는 아무런 일도 일어나지 않습니다.
 * 또한 바구니는 모든 인형이 들어갈 수 있을 만큼 충분히 크다고 가정합니다.
 * 게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때,
 * 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 구하는 프로그램을 작성하세요.
 * 
 * 첫 줄에 자연수 N(5<=N<=30)이 주어집니다.
 * 두 번째 줄부터 N*N board 배열이 주어집니다.
 * board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다.
 * 0은 빈 칸을 나타냅니다.
 * 1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나타냅니다.
 * board배열이 끝난 다음줄에 moves 배열의 길이 M이 주어집니다.
 * 마지막 줄에는 moves 배열이 주어집니다.
 * moves 배열의 크기는 1 이상 1,000 이하입니다.
 * moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수입니다.
 * 
 * 첫 줄에 터트려져 사라진 인형의 개수를 출력합니다.
 */
import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();
    int[][] arr = new int[input1][input1];

    for(int i = 0; i < input1; i++){
      for(int j = 0; j < input1; j++){
        arr[i][j] = in.nextInt();
      }
    }

    int input2 = in.nextInt();
    Stack<Integer> stack = new Stack();
    int result = 0;

    for(int i = 0; i < input2; i++){
      int y = in.nextInt() - 1;
      int x = 0;
      while(x < input1 && arr[x][y] == 0){
        x++;
      }
      if(x == input1){
        continue;
      }

      if(!stack.empty() && stack.lastElement() == arr[x][y]){
        stack.pop();
        result += 2; // 기존 인형 한개 터지고 새 인형은 터진것으로 간주하여 넣지 않았기 때문에 총 두개가 터진것으로 카운팅한다.
      }else{
        stack.push(arr[x][y]);
      }
      arr[x][y] = 0; //인형 뽑았으니 뽑은자리는 빈자리로 변경
    }
    
    System.out.print(result);
  }
}