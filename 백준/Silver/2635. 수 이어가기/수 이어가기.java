import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        int count = 0;
        while(true) {
            count++;
            if(count > n) {
                break;
            }
            int temp = count;
            int idx = 1;
            ArrayList<Integer> tempArr = new ArrayList<>();
            tempArr.add(n);
            tempArr.add(count);
            while(true) {
                int value = tempArr.get(idx - 1) - tempArr.get(idx);
                if(value >= 0) {
                    idx++;
                    temp = value;
                    tempArr.add(temp);
                    continue;
                }
                break;
            }

            if(arr.size() < tempArr.size()) {
                arr = tempArr;
            }
        }
        System.out.println(arr.size());
        for(int i=0; i<arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}