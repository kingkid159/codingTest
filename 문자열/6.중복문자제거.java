/**
 * 6. 중복문자제거
 * 
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 * 
 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 * 
 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 */

  
// map을 활용한 풀이
import java.util.*;
  
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        Map<String,Boolean> checkDuplicate = new HashMap<>();
        
        String result = "";
        int strLength = str.length();
        for(int i = 0; i < strLength; i++){
            String target = String.valueOf(str.charAt(i));
            if(checkDuplicate.get(target) == null){
                result += target;
                checkDuplicate.put(target,true);
            }
        }
        System.out.println(result);
        return ;
  }
}

// indexOf를 활용한 풀이
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next(); 
        String result = "";
        int strLength = str.length();
        for(int i = 0; i < strLength; i++){
            char s = str.charAt(i);
             //indexOf는 처음 발견되는 인덱스를 반환하기 때문에 i와 indexOf의 결과가 다르다면 
             //i위치 이전에 이미 중복되는 값이 있었다는 뜻이다.
            if(i == str.indexOf(s)){
                result += s;
            }
        }
        System.out.println(result);
        return ;
  }
}