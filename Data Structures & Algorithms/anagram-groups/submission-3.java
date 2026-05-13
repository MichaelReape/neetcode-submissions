class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //lets try this
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            char[] tempArray = strs[i].toCharArray();
            Arrays.sort(tempArray);
            String temp = String.valueOf(tempArray);

            ArrayList<String> l = map.getOrDefault(temp, new ArrayList<>());
            l.add(strs[i]);
            map.put(temp, l);
        }
        //need to iterate through the map 
        return new ArrayList<>(map.values());
    }
}
