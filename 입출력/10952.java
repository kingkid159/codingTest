import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a,b;
        while(scanner.hasNext()){
            a= scanner.nextInt();
            b= scanner.nextInt();
            if(a + b <=0){
                continue;
            }
            System.out.println(a+b);
        }
    }
}