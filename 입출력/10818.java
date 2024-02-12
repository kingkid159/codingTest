/**
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다
 * 작거나 같은 정수이다.
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */

import java.io.*;
import java.lang.StringBuilder;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int totalIndex = Integer.parseInt(br.readLine());
        String [] numbers = br.readLine().split(" ");
        int max = Integer.parseInt(numbers[0]);
        int min = Integer.parseInt(numbers[0]);
        for (int i = 1; i < totalIndex; i++) {
            int number = Integer.parseInt(numbers[i]);
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        sb.append(min).append(" ").append(max);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}