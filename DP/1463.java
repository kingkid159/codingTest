/**
 * 1로 만들기
 * 
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 * X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * X가 2로 나누어 떨어지면, 2로 나눈다.
 * 1을 뺀다.
 * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 * 
 * 첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.
 * 
 * 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
 */

import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int number = Integer.parseInt(br.readLine());
        int[] resultTable = new int[number + 1];
        
        // ex) number 가 10일때 
        // resultTable[0,1,2,3,4,5,6,7,8,9,10] 에서 각각의 숫자가 1로 최대한 가까워지기 위한 연산방식을 체크하여 카운트한다
        // 2는 1이 되기 위해 2로 나누는 한번의 연산이 필요하고 resultTable[2] = 1 이 된다
        // 3은 1이 되기 위해 3으로 나누는 한번의 연산이 필요하고 resultTable[3] = 1 이 된다
        // 4는 1이 되기 위해 1을 빼는 방법과 2로 나누는 방법이 있을것이고 4에서 1을 빼는 방법은  resultTable[3] + 4에서 1을 뺀 1회 = resultTable[4] = 2가 된다 
        // 4가 1이 되기 위해 2로 나눌 경우 resultTable[2] + 4에서 2를 나눈 연산 1회 = resultTable[4] = 2가 된다 
        // 5가 1이 되기 위해선 1을 빼는 방법 밖에 없고 resultTable[4] + 5에서 1을 빼는 연산횟수 1회 = resultTable[5] = 3이 된다
        // 6이 1이 되기위해선 1을 빼는 방법, 2로 나누는 방법, 3으로 나누는 방법이 있고
        // 1을 뺄 경우 resultTable[5] + (6 - 1 연산횟수) = resultTable[6] = 4
        // 2로 나눌경우  resultTable[3] + (6 / 2 연산횟수) = resultTable[6] = 2
        // 3으로 나눌경우 resultTable[2] + (6 / 3 연산횟수) = resultTable[6] = 2 로 2나 3으로 나눴을때 연산횟수 2회로 최소한의 연산으로 1을 만들 수 있다
        // 이런식으로 2가 1이 되기위한 연산수부터 차곡차곡 쌓아올리게 되면
        // resultTable[10] 은 9 => 3 => 1 로 가는 최적의 연산횟수를 찾을 수 있게된다
        for(int i = 2; i <= number; i++){
            resultTable[i] = resultTable[i - 1] + 1;
            
            if(i % 2 == 0){
                resultTable[i] = Math.min(resultTable[i], resultTable[i / 2] + 1);
            }
            
            if(i % 3 == 0){
                resultTable[i] = Math.min(resultTable[i], resultTable[i / 3] + 1);
            }
            
        }
        bw.write(String.valueOf(resultTable[number]));
        bw.flush();
        bw.close();
    }
}