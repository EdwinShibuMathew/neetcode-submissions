
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer>numSet = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            if(numSet.containsValue(nums[i])){
                return true;
            }
            numSet.put(i,nums[i]);
        }return false;
    }
}
