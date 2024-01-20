/**
 * 숫자의 합
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 * 입력으로 주어진 숫자 N개의 합을 출력한다.
 */


import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        
        int countNumber = Integer.parseInt(br.readLine());
        String number = br.readLine();
        
        for(int i = 0; i < countNumber; i++){
            result += Character.getNumericValue(number.charAt(i)); // char 타입을 int로 강제형변환하니까 아스키코드로 나옴;;
        }

        //원래 BufferedWriter로 하려했는데 int 타입을 그대로 사용하면 에러가 나서 System.out.print로 바꿈
        //BufferedWriter 쓸때는 string으로 타입 변환 하자!!!
        System.out.print(result); 
    }
}