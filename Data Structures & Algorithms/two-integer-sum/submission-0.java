class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> ledger = new HashMap <Integer, Integer>();
        int[] output = new int[2];
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(ledger.containsKey(diff)){
                output[0] = ledger.get(diff);
                output[1] = i;
                return output;
            }
            ledger.put(nums[i], i);
        }
        return output;
    }
}
