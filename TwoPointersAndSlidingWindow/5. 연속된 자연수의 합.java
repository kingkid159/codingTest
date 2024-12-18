/**
 * 5. 연속된 자연수의 합
 * 
 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
 * 만약 N=15이면
 * 7+8=15
 * 4+5+6=15
 * 1+2+3+4+5=15
 * 와 같이 총 3가지의 경우가 존재한다.
 * 
 * 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
 * 
 * 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
 */
import java.util.Scanner;
import java.lang.Math;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    float input1 = in.nextFloat();

    int sum = 0;
    int count = 0;
    int startNum = 1;
    for(int i = 1; i <= Math.ceil(input1/2); i++){
      sum += i;

      if(sum == input1){
        count++;
      }else if(sum > input1){
        while(sum > input1){
          sum -= startNum;
          startNum += 1;
          if(sum == input1){
            count++;
          }
        }
      }
    }
    
    System.out.println(count);
    return ;
  }
}