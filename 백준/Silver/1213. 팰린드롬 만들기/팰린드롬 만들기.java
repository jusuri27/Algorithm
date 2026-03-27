import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder front = new StringBuilder();
        StringBuilder end = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++) {
            int value = str.charAt(i) - 'A';
            arr[value]++;
        }

        char mid = '0';
        int oddCheck = 0;
        boolean check = false;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 1) {
                if(oddCheck == 0) {
                    oddCheck++;
                    mid = (char)(i + 'A');
                } else {
                    check = true;
                    sb.append("I'm Sorry Hansoo");
                    break;
                }
            }
            for(int j=0; j<arr[i]/2; j++) {
                front.append((char)(i+'A'));
                end.insert(0, (char)(i+'A'));
            }
        }
        if(!check) {
            if(mid == '0') {
                sb.append(front).append(end);
            } else {
                sb.append(front).append(mid).append(end);
            }
        }
        System.out.println(sb);
    }
}
// 인트형 알파벳 배열 선언
// 홀수 갯수가 1개인지 확인 mid에 저장
// 짝수인 알파벳 front, end 1개씩 추가