/**
 * 11. 문자열 압축
 * 
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * 단 반복횟수가 1인 경우 생략합니다.
 * 
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 * 
 * 첫 줄에 압축된 문자열을 출력한다.
 */

import java.util.*;
  
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next() + " ";
        int strLength = str.length();
        String result = "";
        int count = 1;
        for(int i = 0; i < strLength - 1; i++){
            char s = str.charAt(i);
            if(s == str.charAt(i+1)){
                count++;
            }else{
                result += count == 1 ? s : String.valueOf(s) + count;
                count = 1;
            }
        }
        
        System.out.print(result);
        return ;
  }
}