/**
 * 별 찍기 - 8
 * 
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 * 
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 
 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 */

import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder  sb = new StringBuilder();
        
        int number = Integer.parseInt(br.readLine());
        String result = "";
        int columnCount = number * 2;
        
        for(int i = 0; i < number; i++){
            for (int j = 0; j < columnCount; j++){
                if(i + 1 > j || columnCount - i - 1 <= j){
                    sb.append("*");
                }else{
                    sb.append(" ");
                }
            } 
            sb.append("\n");
        }
        
        for(int i = columnCount - 1; i > number; i--){
            for (int j = 0; j < columnCount; j++){
                if(i - number > j ||columnCount - (i - number) <= j ){
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