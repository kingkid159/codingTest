/**
 * 5. 특정 문자 뒤집기
 * 
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 * 
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 * 
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 */

import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.next();
    char[] s = str.toCharArray(); // String을 char 배열로 만드는 메서드 toCharArray
    int lt = 0;
    int rt = str.length() - 1;
    
    while(lt < rt){
      boolean isLtAlpabet = Character.isAlphabetic(str.charAt(lt)); //isAlphabetic 으로 알파벳인지 확인 가능
      boolean isRtAlpabet = Character.isAlphabetic(str.charAt(rt));
      if(!isLtAlpabet){
        lt++;
      }
      
      if(!isRtAlpabet){
        rt--;
      }
      
      //시작과 끝에서 각각 시작하여 둘다 알파벳일 경우 서로의 위치를 교환
      if(isLtAlpabet && isRtAlpabet){
        char temp = s[lt];
        s[lt] = s[rt];
        s[rt] = temp;
        rt--;
        lt++;
      }
    }
    
    System.out.println(String.valueOf(s));
    return ;
  }
}