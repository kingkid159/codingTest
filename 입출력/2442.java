/**
 * 별 찍기 - 5
 * 
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
 * 별은 가운데를 기준으로 대칭이어야 한다.
 * 
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */

import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());
        String result = "";
        
        for(int i = 1; i < number + 1; i++){
            for(int idx = 0; idx < number - i; idx++){
                result = result + " ";
            }
            for(int j = 0; j < i * 2 - 1; j++){
                result = result + "*";
            }
            result = result + "\n";
        }
        
        bw.write(result);
        bw.flush();
        bw.close();
    }
}