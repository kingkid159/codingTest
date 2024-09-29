/**
 * 12. 암호
 * 
 * 1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.
 * 2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.
 * 3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.
 * 
 * 첫 줄에는 보낸 문자의 개수(10을 넘지 안습니다)가 입력된다. 다음 줄에는 문자의 개수의 일곱 배 만큼의 #또는 * 신호가 입력됩니다.
 * 현수는 항상 대문자로 해석할 수 있는 신호를 보낸다고 가정합니다.
 * 
 * 영희가 해석한 문자열을 출력합니다.
 */

// 2진수를 10진수로 직접 바꾸는 방법
import java.util.*;
  
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        in.next();
        int codeLength = 1;
        String str = in.next();
        int strLength = str.length();
        int code = 0;
        int unit = 1;
        StringBuilder sb = new StringBuilder();
        
        for(int i = strLength - 1; 0 <= i; i--){
            char s = str.charAt(i);
            if(s == '#'){
                code += unit;
            }
            unit *= 2;
            codeLength ++;
            if(codeLength > 7){
                sb.append((char) code);
                unit = 1;
                code = 0;
                codeLength = 1;
            }
        }
        
        System.out.print(sb.reverse().toString());
        return ;
  }
}

//parseInt를 사용해 2진수를 10진수로 바꾸는 방법
import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int wordLength = in.nextInt();
    String code = in.next();
    String result = "";
    for(int i = 0; i < wordLength; i++){
      String word = code.substring(0,7);
      word = word.replace('#','1').replace('*','0');
      result += (char) Integer.parseInt(word,2);
      code = code.substring(7); // 앞에서부터 7자리씩 끊어서 복호화하고 복호화 한 암호는 제거한다
    }
    System.out.println(result);
    return ;
  }
}