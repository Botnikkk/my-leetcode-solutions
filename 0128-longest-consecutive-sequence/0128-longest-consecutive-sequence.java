class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){return 0;}
        int output=1;
        Arrays.sort(nums);
        int high=1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == (nums[i - 1]+1)){
                high++;
                if(high > output){
                    output = high;
                }
            }else if(nums[i] > (nums[i - 1]+1)){
                high = 1;
            }
        }
        return output;
    }
}