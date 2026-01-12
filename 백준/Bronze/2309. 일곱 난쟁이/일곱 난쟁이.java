import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int sum = 0;

        for(int i=0; i<9; i++) {
            arr.add(sc.nextInt());
            sum += arr.get(i);
        }
        
        Loop:
        for(int i=0; i<arr.size(); i++) {
            for(int j=i+1; j<arr.size(); j++) {
                if(sum - (arr.get(i) + arr.get(j)) == 100) {
                    arr.remove(j);
                    arr.remove(i);
                    break Loop;
                }
            }
        }

        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}