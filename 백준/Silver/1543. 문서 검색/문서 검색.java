import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        int n = 0;
        while(n<doc.length()) {
            n++;
            if(doc.contains(word)) {
                doc = doc.replaceFirst(word, "*");
                n = 0;
            }
        }
        
        int answer = 0;
        for(int i=0; i<doc.length(); i++) {
            if(doc.charAt(i) == '*') {
                answer++;
            }
        }
        System.out.println(answer);
    }
}