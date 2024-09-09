/**
 * 별 찍기 - 16
 * 
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 * 
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */

import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int number = Integer.parseInt(br.readLine());
        int numberX2 = number * 2;
        int lastIndex = number;
        
        for(int i = number; i > 0; --i){
            lastIndex++;
            boolean flag = true;
            for(int j = 1; j < numberX2; j++){
                if(j >= i && flag){
                    sb.append("*");
                    flag = false;
                }else if(j < lastIndex){
                    sb.append(" ");
                    flag = true;
                }
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}