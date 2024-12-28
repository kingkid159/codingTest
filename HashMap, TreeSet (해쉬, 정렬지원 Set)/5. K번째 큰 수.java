/**
 * 5. K번째 큰 수
 * 
 * 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
 * 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
 * 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
 * 만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
 * 
 * 첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.
 * 
 * 첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.
 */

import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();
    int input2 = in.nextInt();

    Integer[] arr = new Integer[input1];
    for(int i = 0; i < input1; i++){
      arr[i] = in.nextInt();
    }

    TreeSet<Integer> resultSet = new TreeSet(Collections.reverseOrder()); //TreeSet 은 중복제거와 정렬을 모두 처리할 수 있다. 기본은 오름차순

    for(int i = 0; i < input1; i++){
      for(int j = i + 1; j < input1; j++){
        for(int k = j + 1; k < input1; k++){
          resultSet.add(arr[i] + arr[j] + arr[k]);
        }
      }
    }
  
    System.out.print(resultSet.size() < input2 ? -1 : resultSet.toArray()[input2 - 1]);
    return ;
  }
}