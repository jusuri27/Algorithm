import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] people = new int[n][2];

        for(int i=0; i<people.length; i++) {
            people[i][0] = sc.nextInt();
            people[i][1] = sc.nextInt();
        }

        for(int i=0; i<people.length; i++) {
            int ranking = 1;
            for(int j=0; j<people.length; j++) {
                if(i == j) {
                    continue;
                }
                if(people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    ranking++;
                }
            }
            System.out.println(ranking);
        }
    }
}