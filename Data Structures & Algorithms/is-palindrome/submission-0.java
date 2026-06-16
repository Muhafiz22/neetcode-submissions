class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] input = s.toCharArray(); 
        int end = input.length - 1;

        for(int i = 0; i < s.length()/2; i++){
            if(input[i] == input[end]){
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
