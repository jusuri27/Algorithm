import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int countZero = 0;
        int countOne = 0;
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) != str.charAt(i-1)) {
                if(str.charAt(i-1) == '0') {
                    countZero++;
                } else if(str.charAt(i-1) == '1') {
                    countOne++;
                }
            }
        }

        if(str.charAt(str.length()-1) == '1') {
            countOne++;
        } else {
            countZero++;
        }

        System.out.println(Math.min(countOne, countZero));

    }
}