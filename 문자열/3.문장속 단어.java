/**
 * 3. 문장 속 단어
 * 
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 * 
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 * 
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
 * 단어를 답으로 합니다.
 */
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //System.in에 띄어쓰기가 있으므로 nextLine() 사용
        String[] splitStr = str.split(" ");
        int splitStrLength = splitStr.length;
        
        String result = "";
        
        for(int i = 0; i < splitStrLength; i++){
            if(result.length() < splitStr[i].length()){
                result = splitStr[i];
            }
        }
        
        System.out.print(result);
	};
}