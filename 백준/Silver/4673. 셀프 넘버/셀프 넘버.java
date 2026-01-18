public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10001];
        for(int i=1; i<=10000; i++) {
            int temp = i;
            int sum = 0;

            while(temp>0) {
                sum += temp % 10;
                temp /= 10;
            }

            if(i + sum <= 10000) {
                arr[i + sum] = 1;
            }
        }

        for(int i=1; i<arr.length; i++) {
            if(arr[i] != 1) {
                System.out.println(i);
            }
        }
    }
}