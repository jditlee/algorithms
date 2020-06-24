class Solution {
    public int removeDuplicates(int[] nums) {
        if(null == nums || nums.length ==0)return 0;
        
        int back = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[back]!=nums[i]){
                back++;
                nums[back] = nums[i];
            }
        }
        return back+1;
    }
}