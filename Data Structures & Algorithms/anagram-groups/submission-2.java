class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char [] word = str.toCharArray();
            Arrays.sort(word);
            String key = new String(word);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}
