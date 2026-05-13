class Solution {
    public boolean isPalindrome(String s) {
        //two pointers start and end, they should == each other 
        //if one is not alpha numeric skip it 
        //if not equal return false else if pointers cross return true
        String a = s.toLowerCase();
        int left = 0, right = a.length()-1;
        while(left < right){
            while(left < right && !String.valueOf(a.charAt(left)).matches("[a-zA-Z0-9]")){
                left++;
            }
            while(right > left && !String.valueOf(a.charAt(right)).matches("[a-zA-Z0-9]")){
                right--;
            }
            if(a.charAt(left) != a.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
