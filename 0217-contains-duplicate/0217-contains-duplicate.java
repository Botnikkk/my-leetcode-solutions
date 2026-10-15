class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(numbers.containsKey(nums[i])){
                return true;
            }else{
                numbers.put(nums[i], 1);
            }
        }
        return false;
    }
}