/**
 * 8. 유효한 팰린드롬
 * 
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 * 알파벳 이외의 문자들은 무시합니다.
 * 
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 * 
 * 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
 */

import java.util.*;

//isAlphabetic으로 알파벳일 경우만 추출하여 체크하는 방법
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        str = str.toUpperCase();
        int strLength = str.length();
        int i = 0;
        String result = "YES";
        while(i < strLength){
            char iS = str.charAt(i);
            char jS = str.charAt(strLength - 1);
            boolean isISAlphabet = Character.isAlphabetic(iS);
            boolean isJSAlphabet = Character.isAlphabetic(jS);
            if(isISAlphabet && isJSAlphabet){
                if(iS != jS){
                    result = "NO";
                    break;
                }
                i++;
                strLength--;
                continue;
            }
            
            if(!isISAlphabet){
                i++;
            }
            
            if(!isJSAlphabet){
                strLength--;
            }
        }
        
        System.out.print(result);
        return ;
  }
}

// 정규표현식과 replaceAll을 이용하여 알파벳만 추출하여 검사하는 방법
import java.util.*;
  
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        str = str.toUpperCase();
      	str = str.replaceAll("[^A-Z]","");
        int strLength = str.length();
        int i = 0;
        String result = "YES";
        while(i < strLength){
			if(str.charAt(i) != str.charAt(strLength - 1)){
              result = "NO";
              break;
            }
          	i++;
          	strLength--;
        }
        
        System.out.print(result);
        return ;
  }
}