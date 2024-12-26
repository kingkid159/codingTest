/**
 * 6. 최대 길이 연속부분수열
 * 
 * 0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다.
 * 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
 * 만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
 * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
 * 여러분이 만들 수 있는 1이 연속된 연속부분수열은
 * 1 1 0 0 1 1 1 1 1 1 1 1 1 1
 * 이며 그 길이는 8입니다.
 * 
 * 첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
 * 두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.
 * 
 * 첫 줄에 최대 길이를 출력하세요.
 */
import java.util.Scanner;
import java.lang.Math;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();
    int input2 = in.nextInt();

    int[] arr = new int[input1];
    for(int i = 0; i < input1; i++){
      arr[i] = in.nextInt();
    }

    int count = 0;
    int lt = 0;
    int result = 0;

    for(int rt = 0; rt < input1; rt++){
      if(arr[rt] == 0){
        count++;
      }
      while(count > input2){
        if(arr[lt] == 0){
          count--;
        }
        lt++;
      }
      result = Math.max(result, rt - lt + 1);
    }

    System.out.print(result);
  }
}