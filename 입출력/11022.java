/**두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
 */

/** 264ms  */
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int a,b;
        for(int i = 0; i < testCase; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            
            System.out.println(String.format("Case #%d: %d + %d = %d",i+1,a,b,a+b));
        }
    }
}

/** 160ms */
import java.io.*;

public class Main {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            bw.write(String.format("Case #%d: %d + %d = %d\n",i+1,a,b,a+b));
        }
        bw.flush();
        bw.close(); 
	}
}


/** 124ms 
 * 확실히 BufferedReader,BufferedWriter,StringBuilder가 빠르긴 하네
 * append를 많이해야하는데도 String.format 보다 빠른건 좀 의외다.
*/
import java.io.*;
import java.lang.StringBuilder;

public class Main {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
        
		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            sb.append("Case #")
              .append(i+1)
              .append(": ")
              .append(a)
              .append(" + ")
              .append(b)
              .append(" = ")
              .append(a+b)
              .append("\n");    
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close(); 
	}
}