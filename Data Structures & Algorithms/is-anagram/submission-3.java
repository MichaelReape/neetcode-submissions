class Solution {
    public boolean isAnagram(String s, String t) {
    //options
    //sort and compare
    //map
    //array of visited count
        if(s.length() != t.length()) return false;
        HashMap <Character, Integer> freqS = new HashMap<>();
        HashMap <Character, Integer> freqT = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            freqS.put(s.charAt(i), freqS.getOrDefault(s.charAt(i), 0) + 1);
            freqT.put(t.charAt(i), freqT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return freqS.equals(freqT);
    }
}
