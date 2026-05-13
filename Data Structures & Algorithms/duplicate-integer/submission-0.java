class Solution {
    public boolean hasDuplicate(int[] nums) {
        //pointer, while loop, for loop

        int point = 0;
        while(point < nums.length){
            for(int i = point+1; i < nums.length; i++){
                if(nums[point] == nums[i]){
                    return true;
                }
            }
            point++;
        }
        return false;
    }
}
