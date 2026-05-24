class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[]{-1};
        }
        int[] answer = new int[arr.length - 1];
        
        int min = arr[0];
        int target = 0;
        for(int i=1; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
                target = i;
            }
        }
        
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(target == i) {
                continue;
            }
            answer[count] = arr[i];
            count++;
        }
        return answer;
    }
}