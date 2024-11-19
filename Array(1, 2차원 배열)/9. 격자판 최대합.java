/**
 * 9. 격자판 최대합
 * 
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 * 
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 * 
 * 최대합을 출력합니다.
 */

import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();
    
      int seroHab = 0;
      int garoHab = 0;
      int degakHab = 0;
      int bandegakHab = 0;
      int maxHab = 0;
      
      List<List<Integer>> meunToList = new ArrayList<>();
      
      for(int i = 0; i < input1; i++){
        List<Integer> hangToList = new ArrayList<>();
          for(int j = 0; j < input1; j++){
              hangToList.add(in.nextInt());
          }
          meunToList.add(hangToList);
      }
      
      for(int i = 0; i < input1; i++){
          garoHab = 0;
          seroHab = 0;
          for(int j = 0; j < input1; j++){
              garoHab += meunToList.get(i).get(j);
              seroHab += meunToList.get(j).get(i);       
          }
          
          degakHab += meunToList.get(i).get(i);
          bandegakHab += meunToList.get(input1 - i - 1).get(input1 - i - 1);
          if(maxHab < garoHab){
              maxHab = garoHab;
          }
          if(maxHab < seroHab){
              maxHab = seroHab;
          }
          if(maxHab < degakHab){
              maxHab = degakHab;
          }
          if(maxHab < bandegakHab){
              maxHab = bandegakHab;
          }
      }
      
      System.out.println(maxHab);
    return ;
  }
}