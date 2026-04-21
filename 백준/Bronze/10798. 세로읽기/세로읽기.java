import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<char[]> list = new ArrayList<>();
        int size = 5;

        int maxLen = 0;
        for(int i=0; i<size; i++) {
            String str = sc.nextLine();
            maxLen = Math.max(maxLen, str.length());
            list.add(str.toCharArray());
        }

        for(int i=0; i<maxLen; i++) {
            for(int j=0; j<list.size(); j++) {
                if(list.get(j).length > i) {
                    System.out.print(list.get(j)[i]);
                }
            }
        }
    }
}