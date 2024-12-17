/**
 * 2. 공통원소 구하기
 * 
 * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
 * 
 * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
 * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
 * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
 * 
 * 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
 */

package TwoPointersAndSlidingWindow;

import java.util.*;

public class Main {
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();
    List<Integer> aList = new ArrayList<>();
    for(int i = 0; i < input1; i++){
        aList.add(in.nextInt());
    }
    int input2 = in.nextInt();
    List<Integer> bList = new ArrayList<>();
    for(int i = 0; i < input2; i++){
        bList.add(in.nextInt());
    }
    Collections.sort(aList);
    Collections.sort(bList);

    int aPointer = 0;
    int bPointer = 0;
    List<Integer> resultList = new ArrayList<>();
    while(aPointer < input1 && bPointer < input2){
        int aValue = aList.get(aPointer);
        int bValue = bList.get(bPointer);
        if(aValue < bValue){
            aPointer++;
        }else if(aValue > bValue){
            bPointer++;
        }else{
            resultList.add(aValue);
            aPointer++;
            bPointer++;
        }
    }

    for(int i = 0; i < resultList.size(); i++){
        System.out.print(resultList.get(i));
        System.out.print(" ");
    }
    return ;
  }
}
