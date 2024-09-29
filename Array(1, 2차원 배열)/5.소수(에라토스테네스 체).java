/**
 * 5. 소수(에라토스테네스 체)
 * 
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 * 
 * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 * 
 * 첫 줄에 소수의 개수를 출력합니다.
 */

//정답
//풀이: 에라토스테네스 체 기법 사용
import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int num = in.nextInt();
    boolean[] numList = new boolean[num + 1];
    int count = 0;
    for(int i = 2; i < num; i++){
        if(!numList[i]){ //numList의 인덱스 값이 false면 해당 숫자는 소수임
            count++;
            for(int j = i; j < num; j=j+i){ //소수인 항목의 배수는 모두 소수가 아니기 때문에 true로 일괄변경 j가 i씩 증가한다는것은 i의 배수라는 것
                numList[j] = true;
            }
        }
    }
    System.out.print(count);
  }
}

//오답 1. 
//오답 원인: timeout
//풀이: 앞서 나왔던 소수들로 나눴을때 나머지가 없으면 해당 숫자는 소수가 아니다.
import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int num = in.nextInt();
    int[] numList = new int[num];
    numList[0] = 2;
    int count = 0;
    for(int i = 3; i < num; i++){
        boolean isPrime = true;
        for(int j = 0; j < num; j++){
            if(numList[j] != 0 && i % numList[j] == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            numList[i - 1] = i;
        }
    }
      
    for(int i = 0; i < num; i++){
        if(numList[i] != 0){
          count++;
        }
    }
    System.out.print(count);
  }
}

//오답 2.
//오답원인 : timeout
//풀이: 오답 1과 원리는 같지만 리스트를 사용하여 소수가 아닌 수는 numList에서 배제할 수 있었고 줄어든 numList 사이즈로 인해 성능향상을 기대함
//결과: 유의미한 수준으로 성능개선이 됐지만 그럼에도 timeout
import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int num = in.nextInt();
    List<Integer> numList = new ArrayList<>();
    numList.add(2);
    int count = 0;
    for(int i = 3; i < num; i++){
        boolean isPrime = true;
        for(int j = 0; j < numList.size(); j++){
            if(i % numList.get(j) == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            numList.add(i);
        }
    }
      
    System.out.print(numList.size());
  }
}