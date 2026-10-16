class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int[] preffixArr = new int[n];
        int[] suffixArr = new int[n];
        preffixArr[0] = 1;
        suffixArr[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            preffixArr[i] = preffixArr[i - 1] * nums[i - 1];
            suffixArr[n - i - 1] = suffixArr[n - i] * nums[n - i];
        }
        for (int j = 0; j < n; j++) {
            answer[j] = preffixArr[j] * suffixArr[j];
        }
        return answer;
    }
}