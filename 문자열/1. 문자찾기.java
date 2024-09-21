/**
 * 1. 문자찾기
 * 
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 * 
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 * 
 * 첫 줄에 해당 문자의 개수를 출력한다.
 */

import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char target = sc.next().charAt(0);
        
        str = str.toUpperCase();
        target = Character.toUpperCase(target);
        
        int strLength = str.length();
        
        int result = 0;
        
        for(int i = 0; i < strLength; i++){
            if(str.charAt(i) == target){
                result++;
            }
        }
        System.out.print(result);
	};
}