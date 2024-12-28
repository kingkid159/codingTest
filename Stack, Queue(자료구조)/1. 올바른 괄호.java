/**
 * 1. 올바른 괄호
 * 
 * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
 * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
 * 
 * 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
 * 
 * 첫 번째 줄에 YES, NO를 출력한다.
 */
import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    char[] arr = in.next().toCharArray();
    int check = 0;
    String result = "YES";

    for(char x : arr){
      if(check < 0){
        result = "NO";
        break;
      }
      if(x == ')'){
        check--;
      }else{
        check++;
      }
    }

    if(check != 0){
      result = "NO";
    }
  
    System.out.print(result);
    return ;
  }



//////////////////////////스택을 활용한 방법///////////////////////////  

  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    char[] arr = in.next().toCharArray();
    Stack<Character> stack = new Stack<>();

    String result = "YES";

    for(char x : arr){
      if(x == '('){
        stack.add('(');
      }else{
        if(stack.isEmpty()){
          result = "NO";
          break;
        }else{
          stack.pop();
        }
      }
    }

    if(!stack.isEmpty()){
      result = "NO";
    }

    System.out.print(result);
    return ;
  }
}