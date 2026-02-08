import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int minPackage = Integer.MAX_VALUE;
        int minUnit = Integer.MAX_VALUE;

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int packageValue = Integer.parseInt(st.nextToken());
            int unitValue = Integer.parseInt(st.nextToken());

            minPackage = Math.min(minPackage, packageValue);
            minUnit = Math.min(minUnit, unitValue);
        }

        if(minUnit == 0 | minPackage == 0) {
            System.out.println(0);
            return;
        }

        int range = minPackage / minUnit;
        int mod = n % 6;
        int group = n / 6;

        if(range >= 6) {
            System.out.println(minUnit * n);
            return;
        }

        int value = minPackage * group;
        if(mod > range) {
            value += minPackage;
        } else {
            value += minUnit * mod;
        }

        System.out.println(value);


    }
}