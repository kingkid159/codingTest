/**
 * 별 찍기 - 12
 * 
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 * 
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 
 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 */

import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(br.readLine());
        
        for(int i = 1; i < number * 2; i++){
            for(int j = 1; j <= number; j++ ){
                boolean condition = true;
                if(i < number){
                    condition = number - i < j;
                }else{
                    condition = i - number < j;
                }
                
                if(condition){
                    sb.append("*");
                }else{
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}