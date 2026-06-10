class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String str: strs){

            HashMap<Character, Integer> charCount = new HashMap<>();
            char[] word = str.toCharArray();

            //make hashmap of char -> frequency for each word
            for(int i = 0; i < word.length; i++){
                if(charCount.containsKey(word[i])){
                    charCount.put(word[i], charCount.get(word[i]) + 1);
                }else{
                    charCount.put(word[i], 1);
                }
            }
            
            List<Character> chars = new ArrayList<>(charCount.keySet());
            Collections.sort(chars);

            //makes canonical unique key for lookups
            String key = "";
            for(char ch : chars){
                key += ch +":"+ charCount.get(ch); 
            }

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
