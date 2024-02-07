/**
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * 1부터 n까지 합을 출력한다.
 */

import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int number = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 1; i <= number; i++){
            sum += i;
        }
        
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}