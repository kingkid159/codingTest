/**
 * 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알내는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 빈 칸을 사이에 두고 x(1 ≤ x ≤ 12)와 y(1 ≤ y ≤ 31)이 주어진다. 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월
 * 은 30일까지, 2월은 28일까지 있다.
 * 
 * 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
 */


import java.io.*;
import java.time.LocalDate;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] monthDay = (br.readLine()).split(" ");
        
        int year = 2007;
        int month = Integer.parseInt(monthDay[0]);
        int day = Integer.parseInt(monthDay[1]);
        
        LocalDate date = LocalDate.of(year,month,day);
        bw.write((date.getDayOfWeek()).toString().substring(0,3));
        bw.flush();
        bw.close();
    }
}
