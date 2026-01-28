import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> maxList = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            int idx = 0;
            arr.add(n);
            arr.add(i);

            while(true) {
                int nextValue = arr.get(idx) - arr.get(idx + 1);
                if(nextValue < 0) {
                    break;
                } else {
                    arr.add(nextValue);
                    idx++;
                }
            }

            if(arr.size() > maxList.size()) {
                maxList = arr;
            }
        }
        System.out.println(maxList.size());
        for(int i=0; i< maxList.size(); i++) {
            System.out.print(maxList.get(i) + " ");
        }
    }
}