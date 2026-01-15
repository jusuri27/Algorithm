import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] people = new int[num][2];

        for(int i=0; i<num; i++) {
            people[i][0] = sc.nextInt();
            people[i][1] = sc.nextInt();
        }

        int[] ranking = new int[num];

        for(int i=0; i<people.length; i++) {
            int value = 1;
            for(int j=0; j<people.length; j++) {
                if(i == j) {
                    continue;
                }
                if(people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    value++;
                }
            }
            ranking[i] = value;
        }

        for(int i : ranking) {
            System.out.print(i+ " ");
        }
    }
}