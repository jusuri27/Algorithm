import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n % 2 == 1) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}

/*
1 - sk
2 - cy
3 - sk
4 - cy
5 - sk
6 - cy


 */