/**
 * 2×n 타일링
 * 
 * 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * 아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.
 * 
 * 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
 * 
 * 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 */

import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int number = Integer.parseInt(br.readLine());
        long[] numberOfCase = new long[number];
        numberOfCase[0] = 1;
        if(number > 1){
            numberOfCase[1] = 2;
        }
        
        for(int i = 2; i < number; i++){
            numberOfCase[i] = (numberOfCase[i - 1] + numberOfCase[i - 2]) % 10007;
        }
        bw.write(String.valueOf(numberOfCase[number - 1]));
        bw.flush();
        bw.close();
    }
}