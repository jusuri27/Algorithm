import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Set<String > set = new HashSet<>();

        for(int i=0; i<n; i++) {
            set.add(sc.nextLine());
        }

        List<String> list = new ArrayList<>(set);
        list.sort((a, b) -> {
            if(a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
