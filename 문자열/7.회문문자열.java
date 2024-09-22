/**
 * 7. 회문문자열
 * 
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 * 
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는
 * 프로그램을 작성하세요.
 * 
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 * 
 * 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 */
import java.util.*;
  
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        String strUpperCase = str.toUpperCase(); // String 타입으로 형변환 후 equalsIgnoreCase 로 비교해도 됨
        int strLength = strUpperCase.length() - 1;
        int i = 0;
        boolean isYes = true;
        
        while(i < strLength){
            if(strUpperCase.charAt(i) != strUpperCase.charAt(strLength)){
                isYes = false;
              	break;
            }
            i++;
            strLength--;
        }
        System.out.println(isYes ? "YES" : "NO");
        return ;
  }
}