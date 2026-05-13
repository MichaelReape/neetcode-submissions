class Solution {
    public boolean hasDuplicate(int[] nums) {
        //pointer, while loop, for loop

        // int point = 0;
        // while(point < nums.length){
        //     for(int i = point+1; i < nums.length; i++){
        //         if(nums[point] == nums[i]){
        //             return true;
        //         }
        //     }
        //     point++;
        // }
        // return false;

        //using sort
        // Arrays.sort(nums);
        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i] == nums [i-1]){
        //         return true;
        //     }
        // }
        // return false;

        //use a hashset / map to keep a list of seen numbers

        Set<Integer> seen = new HashSet<>();
        for(int n : nums){
            if(seen.contains(n)){
                return true;
            }
            seen.add(n);
        }
        return false;
    }
}
