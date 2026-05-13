class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> a = new HashSet<>();
        for(int n : nums){
            a.add(n);
        }
        return a.size() != nums.length;
    }
}