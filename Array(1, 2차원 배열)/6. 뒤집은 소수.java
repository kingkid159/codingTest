/**
 * 6. 뒤집은 소수
 * 
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야한다.
 * 첫 자리부터의 연속된 0은 무시한다.
 * 
 * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
 * 각 자연수의 크기는 100,000를 넘지 않는다.
 * 
 * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 */

import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();
    in.nextLine();
    String input2 = in.nextLine().trim(); //테스트 케이스 중 입력값 뒤에 공백이 있는 경우가 있어서 제거
    StringBuilder input2Sb = new StringBuilder(input2);
    String[] inputArray = input2Sb.reverse().toString().split(" "); // reverse로 전체 문장을 뒤집고 뒤에서부터 탐색하면 뒤집힌 숫자의 값을 얻을 수 있다.
    int maxNum = 100000;
    boolean[] numbers = new boolean[maxNum + 1];
    StringBuilder sb = new StringBuilder();
    numbers[0] = true;
    numbers[1] = true;
    
    for(int i = 2; i < maxNum; i++){
      numbers[i] = false;
    }
    
    // 에라스토테네스의 체를 활용해 100,000 이하의 소수 리스트를 구한다.
    for(int i = 2; i < maxNum; i++){
      if(!numbers[i]){
        for(int j = 2; j * i < maxNum; j++){
          numbers[j * i] = true;
        }
      }
    }
    
    // 입력된 값의 인덱스로 소수 리스트에 접근하여 해당 숫자가 소수인지 확인한다.
    for(int i = input1; i > 0; i--){
        int num = Integer.parseInt(inputArray[i - 1]);
      if(!numbers[num]){
        sb.append(num);
        sb.append(" ");
      }
    }
    
    System.out.print(sb.toString());
    return ;
  }
}