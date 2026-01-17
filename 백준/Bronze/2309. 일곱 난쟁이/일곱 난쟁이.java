import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] people = new int[9];
        int sum = 0;
        for(int i=0; i<people.length; i++) {
            people[i] = sc.nextInt();
            sum += people[i];
        }
        Arrays.sort(people);

        for(int i=0; i<people.length; i++) {
            for(int j=i+1; j<people.length; j++) {
                if(sum - people[i] - people[j] == 100) {
                    people[i] = -1;
                    people[j] = -1;
                    for(int k=0; k<people.length; k++) {
                        if(people[k] >= 0) {
                            System.out.println(people[k]);
                        }
                    }
                    return;
                }
            }
        }

    }
}