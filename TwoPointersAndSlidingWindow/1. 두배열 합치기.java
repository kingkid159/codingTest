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