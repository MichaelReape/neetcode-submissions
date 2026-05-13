class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //index array of letters, add to it and remove from it
        //or just order and .contains
        //use an array of letter like before but this time it can be used 
        //as a key for a map of the outputs

        Map<String, List<String>> res = new HashMap<>();
        for(String s: strs){
            int[] arr = new int[26];
            for(int i = 0; i < s.length();i++){
                char c = s.charAt(i);
                arr[c - 'a']++;
            }
            String key = Arrays.toString(arr);
            if(res.containsKey(key)){
                res.get(key).add(s);
            }else{
                res.put(key, new ArrayList<>());
                res.get(key).add(s);
            }
        }
        return new ArrayList<>(res.values());

    }
}
