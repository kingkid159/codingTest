import java.io.*;
import java.lang.StringBuilder;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(br.readLine());
        for(int i = 0; i < number; i++){
            for(int j = 0; j < i + 1; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}