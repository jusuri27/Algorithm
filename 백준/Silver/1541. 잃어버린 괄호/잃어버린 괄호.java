import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("-");
        for(int i=0; i<arr.length; i++) {
            if(arr[i].contains("+")) {
                String[] value = arr[i].split("[+]");
                int sum = 0;
                for(int j=0; j<value.length; j++) {
                    sum += Integer.parseInt(value[j]);
                }
                arr[i] = String.valueOf(sum);
            }
        }

        int answer = Integer.parseInt(arr[0]);
        for(int i=1; i<arr.length; i++) {
            answer -= Integer.parseInt(arr[i]);
        }
        System.out.println(answer);
    }
}
/*

10-20-30+40
10+20+30+40-10+20+30+40
10+20+30+40-10+20+30-40
 */