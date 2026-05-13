class Solution {
    public boolean isAnagram(String s, String t) {
        //redundancy
        if(s.length() != t.length()){
            return false;
        }
        //arr of all english letters
        int[] count = new int[26];
        //add 1 for the value in s, -1 for value in t
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int x: count){
            if(x > 0){
                return false;
            }
        }
        return true;

    }
}
