/**
 * 10. 가장 짧은 문자거리
 * 
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 * 
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 * 
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 */

//target의 인덱스를 찾아 리스트에 담고 인덱스끼리 계산하여 최단거리를 계산하는 방법
import java.util.*;
  
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        int strLength = str.length();
        char target = in.next().charAt(0);
        String result = "";
        List<Integer> targetLocation = new ArrayList<>();
        
        int j = 0;
        int k = 1;
        
        for(int i = 0; i < strLength; i++){
            if(str.charAt(i) == target){
                targetLocation.add(i);
            }
        }
        
        for(int i = 0; i < strLength; i++){
            int jIndex = targetLocation.get(j);
            int kIndex = targetLocation.get(k);
            if(i < jIndex){
                result += jIndex-i;
            }else if(i == jIndex){
                result += 0;
            }else if(jIndex < i && i < kIndex){
                if(i - jIndex <= kIndex - i){
                    result += i-jIndex;
                }else{
                    result += kIndex - i;
                }
            }else{
                result += i-kIndex;
                if(targetLocation.size() - 1 != k){ 
                    j++;
                    k++;
                }
            }
            
            if(i != strLength - 1){
                result += " ";   
            }
        }
        
        System.out.print(result);
        return ;
  }
}

//정방향과 역방향으로 각각 거리를 계산한 후 정방향과 역방향중 더 가까운거리를 찾는 방법
//ex) teachermode의 타겟이 e 일때 아래 로직을 사용할 경우
// 정방향   [100,0,1,2,3,0,1,2,3,4,0]
// 역방향   [1  ,0,3,2,1,0,4,3,2,1,0]
// 최단거리 [1  ,0,1,2,1,0,1,2,2,1,0]
import java.util.*;
  
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        char target = in.next().charAt(0);
        int value = 100; // 문자열의 길이가 100을 넘지 않는다고 정의되어있기때문에 100을 기본값을 정의한다
        // 가장 먼저 타겟이 되는 인덱스보다 작은 인덱스에 있는 항목들은 역순과 함께 계산했을때 역순이 우선순위를 가져야하기때문
        int[]aCase = new int[100];
        int strLength = str.length();
        String result = "";
        
        for(int i = 0; i < strLength; i++){
            if(str.charAt(i) == target){
                value = 0;
            }else{
                value++; 
            }
            aCase[i] = value;
        }
        
        value = 100;
        // 가장 마지막 타겟이 되는 인덱스보다 큰 인덱스에 있는 항목들은 정방향과 함께 계산했을때 정방향이 우선순위를 가져야하기때문
        for(int i = strLength - 1; i >= 0; i--){
            if(str.charAt(i) == target){
                value = 0;
            }else{
                value++; 
            }
            aCase[i] = aCase[i] < value ? aCase[i] : value;
        }
        
        int caseLength = aCase.length;
        for(int i = 0; i < strLength; i++){
            result += aCase[i];
            if(i != caseLength){
                result += " ";
            }
        }
        
        System.out.print(result);
        return ;
  }
}