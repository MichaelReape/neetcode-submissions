class Solution {
    public boolean hasDuplicate(int[] nums) {
        //nested for loop would be O(n^2)
        //could keep track with a map

        // HashMap<Integer, Integer> visited = new HashMap<>();
        // int[] visited = new int[nums.size];
        // for(int n: nums){
            // if(!visited.containsKey(n)){
            //     visited.put()
            // }
        // }
        Arrays.sort(nums);
        for(int i = 1; i< nums.length; i++){
            if(nums[i-1]==nums[i]) return true;
        }
        return false;
    }
}
