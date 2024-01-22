/**
 * 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
 * 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 단어가 주어진다. 단어는 알파벳 소문자와 대문자로만 이루어져 있으며, 길이는 100을 넘지 않는다. 길이가 0인 단어는 주어지지 않는다.
 * 입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력한다. 단어의 길이가 10의 배수가 아닌 경우에는 마지막 줄에는 10개 미만의 글자만 출력할 수도 있다.
 */


import java.io.*;
import java.lang.StringBuilder;

class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String word = br.readLine();
        int wordLength = word.length();
        
        for(int i = 0; i < wordLength; i++){
            if(i > 0 && i % 10 == 0){
                sb.append("\n");
            } 
            sb.append(word.substring(i,i+1));
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

// ============================================================================

// try catch로 처리해보고싶어서 만든 코드
import java.io.*;
import java.lang.StringBuilder;

class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String word = br.readLine();
        int wordLength = word.length();
        
        for(int i = 0; i < wordLength; i+=10){
            try{
                sb.append(word.substring(i,i+10));
                sb.append("\n");
            }catch(StringIndexOutOfBoundsException e){
                sb.append(word.substring(i,wordLength));
            }          
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
