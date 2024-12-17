/**
 * 1. 두 배열 합치기
 * 
 * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
 * 
 * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
 * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
 * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
 * 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
 * 
 * 오름차순으로 정렬된 배열을 출력합니다.
 */

package TwoPointersAndSlidingWindow;

import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();
    int[] aArr = new int[input1];
    for(int i = 0; i < input1; i++){
        aArr[i] = in.nextInt();
    }
    int input2 = in.nextInt();
    int[] bArr = new int[input2];
    for(int i = 0; i < input2; i++){
        bArr[i] = in.nextInt();
    }
    int totalIdx = input1 + input2;
    int[] resultArr = new int[totalIdx];
    int resultIdx = 0;
    int point1 = 0;
    int point2 = 0;

    while(point1 < input1 && point2 < input2){
        if(aArr[point1] < bArr[point2]){
            resultArr[resultIdx++] = aArr[point1++];
        }else{
            resultArr[resultIdx++] = bArr[point2++];
        }
    }

    while(point1 < input1){
        resultArr[resultIdx++] = aArr[point1++];
    }

    while(point2 < input2){
        resultArr[resultIdx++] = bArr[point2++];
    }

    for(int i = 0; i < totalIdx; i++){
        System.out.print(resultArr[i]);
        System.out.print(" ");
    }
    return ;
  }
}