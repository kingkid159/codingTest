/**
 * 4. 모든 아나그램 찾기
 * 
 * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
 * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
 * 
 * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
 * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
 * 
 * S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
 */
import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input1 = in.next();
    String input2 = in.next();

    Map<Character, Integer> sMap = new HashMap<>();
    Map<Character, Integer> tMap = new HashMap<>();
    int lt = 0;
    int rt = 0;
    int count = 0;
    int result = 0;

    for(char x : input2.toCharArray()){
      tMap.put(x, tMap.getOrDefault(x, 0) + 1);
    }

    for(char x : input1.toCharArray()){
      if(rt - lt  + 1 > input2.length()){
        char firstChar = input1.charAt(lt);
        if(tMap.get(firstChar) == sMap.get(firstChar)){
          count -= tMap.get(firstChar);
        }
        sMap.put(firstChar, sMap.get(firstChar) - 1);
        lt++;
      }
      sMap.put(x, sMap.getOrDefault(x, 0) + 1);
      if(tMap.get(x) == sMap.get(x)){
        count += tMap.get(x);
      }
      if(count == input2.length()){
        result++;
      }
      rt++;
    }

    System.out.println(result);
    return ;
  }
}