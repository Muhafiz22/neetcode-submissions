public class Solution {
    public int characterReplacement(String s, int k) {
        int[] charCount = new int[26];

        char[] arr = s.toCharArray();
        int left = 0;
        int right = 0;
        int longest = 0;
        
        while(right < arr.length){

            charCount[arr[right] - 'A']++; 
            int windowLength = right - left + 1;

            while(windowLength - maxCount(charCount) > k){ 
                charCount[arr[left] - 'A']--; 
                left++; 
                windowLength = right - left + 1;
            }

            longest = Math.max(longest, windowLength);
            right++;
        }

        return longest;
    }

    public int maxCount(int[] arr){
        int max = arr[0];
        for(int i = 1; i < 26; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}