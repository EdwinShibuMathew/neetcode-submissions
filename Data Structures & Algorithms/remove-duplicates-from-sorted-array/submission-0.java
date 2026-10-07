class Solution {
    public int removeDuplicates(int[] nums) {
        int ind = 1;
        int temp = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(temp != nums[i]){
                nums[ind] = nums[i];
                temp = nums[i];
                ind++;
            }
        }
        return ind;
    }
}