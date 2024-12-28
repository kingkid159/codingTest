/**
 * 2. 괄호문자제거
 * 
 * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
 * 
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 * 
 * 남은 문자만 출력한다.
 */
import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    char[] arr = in.next().toCharArray();
    Stack<Character> stack = new Stack<>();

    for(char x : arr){
      stack.add(x);
      if(stack.lastElement() == ')'){
        while(stack.pop() != '(');
      }
    }

    String result = "";

    for(char x : stack){
      result += x;
    }
    System.out.print(result);
  }
}