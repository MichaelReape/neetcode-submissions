class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int mid = nums.length/2;
        int high = nums.length;
        int count = 0;
        while(nums[mid] != target){
            if(target > nums[mid]){
                low = mid;
                mid = (low + high)/2;
            }else if(target < nums[mid]){
                high = mid;
                mid = (low + high)/2;
            }
            count++;
            if(count > nums.length){
                return -1;
            }
        }
        return mid;
    }
}
