class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(char ch: s.toCharArray()){
            arr1[ch-'a']++;
        }

        for(char ch: t.toCharArray()){
            arr2[ch-'a']++;
        }

        return Arrays.toString(arr1).equals(Arrays.toString(arr2));
    }
}
