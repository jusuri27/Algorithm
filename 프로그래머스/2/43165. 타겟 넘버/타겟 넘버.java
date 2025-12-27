class Solution {
    static int count;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers, target, 0, 0);
        answer = count;
        return answer;
    }
    
    public static void dfs(int[] numbers, int target, int depth, int result) {
        if(numbers.length == depth) {
            if(target == result) {
                count++;
            }
            return;
        }
        
        dfs(numbers, target, depth+1, result+numbers[depth]);
        dfs(numbers, target, depth+1, result-numbers[depth]);
    }
}