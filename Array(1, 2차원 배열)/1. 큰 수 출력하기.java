/**
 * 1. 큰 수 출력하기
 * 
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * (첫 번째 수는 무조건 출력한다)
 * 
 * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 * 
 * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 */

import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    in.nextLine();
    String str = in.nextLine();
    String[] numList = str.split(" ");
    int numListLength = numList.length;
    String result = numList[0] + " ";
    for(int i = 1; i < numListLength; i++){
      int iNum = Integer.parseInt(numList[i - 1]);
      int jNum = Integer.parseInt(numList[i]);
      if(iNum < jNum){
          result += jNum;
          result += " ";
      }
    }
    System.out.println(result);
    return ;
  }
}