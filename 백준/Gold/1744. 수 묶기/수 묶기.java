import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static int sum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int value = sc.nextInt();
            if(value == 1) {
                sum++;
            }
            if(value <= 0) {
                negative.add(value);
            }
            if(value > 1) {
                positive.add(value);
            }
        }

        Collections.sort(positive);
        Collections.sort(negative, Comparator.reverseOrder());

        cal(positive);
        cal(negative);

        System.out.println(sum);
    }

    public static void cal(ArrayList<Integer> list) {
        for(int i=list.size()-1; i>0; i-=2) {
            sum += list.get(i) * list.get(i-1);
        }
        if(list.size() % 2 == 1) {
            sum += list.get(0);
        }
    }
}