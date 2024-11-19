/**
 * 10. 봉우리
 * 
 * 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
 * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
 * 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
 * 만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
 * 
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 * 
 * 봉우리의 개수를 출력하세요.
 */
import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();
    List<List<Integer>> boxList = new ArrayList<>();
    List<Integer> zeroList = new ArrayList<>();
    int count = 0;

    for(int i = 0; i < input1 + 2; i++){
      zeroList.add(0);
    }
    boxList.add(zeroList);
    for(int i = 0; i < input1; i++){
      List<Integer> hangList = new ArrayList<>();
      hangList.add(0);
      for(int j = 0; j < input1; j++){
        hangList.add(in.nextInt());
      }
      hangList.add(0);
      boxList.add(hangList);
    }
    boxList.add(zeroList);

    for(int i = 1; i < input1 + 1; i++){
      for(int j = 1; j < input1 + 1; j++){
        if(boxList.get(i).get(j) > boxList.get(i).get(j - 1) && boxList.get(i).get(j) > boxList.get(i).get(j + 1) 
        && boxList.get(i).get(j) > boxList.get(i + 1).get(j) && boxList.get(i).get(j) > boxList.get(i - 1).get(j)){
          j++; //봉우리가 생겼으면 그 다음 인덱스는 자연스레 봉우리가 아니므로 넘어감
          count++;
        }
      }
    }

    System.out.println(count);
    return ;
  }
}
