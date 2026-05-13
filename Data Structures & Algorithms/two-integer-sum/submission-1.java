class Solution {
    public int[] twoSum(int[] nums, int target) {
        //make map
        //check if map contains target - i
            //value is location in array
        //return both if yes
        //add i to map and continue if no

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
            return new int []{map.get(target-nums[i]),i};        
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
