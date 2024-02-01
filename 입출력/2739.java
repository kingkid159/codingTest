/**
 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 * 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 * 출력형식과 같게 N*1부터 N*9까지 출력한다.
 */

import java.lang.StringBuilder;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(br.readLine());
        for(int i = 1; i < 10; i++){
            sb.append(number)
                .append(" * ")
                .append(i)
                .append(" = ")
                .append(number * i)
                .append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}