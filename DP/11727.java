/**
 * 2×n 타일링 2
 * 
 * 2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
 * 
 * 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 */

import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int number = Integer.parseInt(br.readLine());
        int[] numberOfCase = new int[number];
        
        numberOfCase[0] = 1;
        if(number > 1){
            numberOfCase[1] = 3;
        }
        
        for(int i = 2; i < number; i++){
          //numberOfCase[i - 2] * 2 를 하는 이유는 마지막 타일을 가로로 놓았을때 잔여공간과 2 x 2 타일을 놓았을때 잔여공간이 같기 때문이다.
            numberOfCase[i] = (numberOfCase[i - 1] + 2 * numberOfCase[i - 2]) % 10007;
        }
        bw.write(String.valueOf(numberOfCase[number - 1]));
        bw.flush();
        bw.close();
    }
}