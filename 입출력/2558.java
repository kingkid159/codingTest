/**
 * A+B - 2
 * 
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
 * 
 * 첫째 줄에 A+B를 출력한다.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.print(a + b);
    }
}