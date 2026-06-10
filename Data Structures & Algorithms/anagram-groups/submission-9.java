class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            int [] charCount = new int[26];
            char[] word = str.toCharArray();

            for(char ch: word){
                charCount[ch - 'a']++;
            }

            String key = Arrays.toString(charCount);

            if(map.containsKey(key)){
                map.get(key).add(str);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
