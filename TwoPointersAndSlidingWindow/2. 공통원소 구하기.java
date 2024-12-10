package TwoPointersAndSlidingWindow;

import java.util.*;

public class Main {
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();
    List<Integer> aList = new ArrayList<>();
    for(int i = 0; i < input1; i++){
        aList.add(in.nextInt());
    }
    int input2 = in.nextInt();
    List<Integer> bList = new ArrayList<>();
    for(int i = 0; i < input2; i++){
        bList.add(in.nextInt());
    }
    Collections.sort(aList);
    Collections.sort(bList);

    int aPointer = 0;
    int bPointer = 0;
    List<Integer> resultList = new ArrayList<>();
    while(aPointer < input1 && bPointer < input2){
        int aValue = aList.get(aPointer);
        int bValue = bList.get(bPointer);
        if(aValue < bValue){
            aPointer++;
        }else if(aValue > bValue){
            bPointer++;
        }else{
            resultList.add(aValue);
            aPointer++;
            bPointer++;
        }
    }

    for(int i = 0; i < resultList.size(); i++){
        System.out.print(resultList.get(i));
        System.out.print(" ");
    }
    return ;
  }
}
