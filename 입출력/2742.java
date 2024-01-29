/**
 * 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 */


import java.io.*;
import java.lang.StringBuilder;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int number = Integer.parseInt(br.readLine());
        
        while(number > 0){
            sb.append(number).append("\n");
            number--;
        }
          System.out.println(sb.toString());
    }
}