/**
 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
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
        int number = Integer.parseInt("5");
        String result = "";
        int space = 0;
        
        while (number > 0){
            for(int i = 0; i < space; i++){
                result = result + " ";
            }
            for(int i = 0; i < number; i++){
                result = result + "*";
            }
            result = result + "\n";
            space++;
            number--;
        }
        
        bw.write(result);
        bw.flush();
        bw.close();
    }
}