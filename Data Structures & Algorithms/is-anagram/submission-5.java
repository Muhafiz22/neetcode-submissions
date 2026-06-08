class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> seen1 = new HashMap<>();
        HashMap<Character, Integer> seen2 = new HashMap<>();

        //iterate and create char -> frequency map
        for(char ch: s.toCharArray()){
            if(seen1.containsKey(ch)){
                seen1.put(ch, seen1.get(ch) + 1);
            }else{
                seen1.put(ch, 1);
            }
        }

        //iterate and create char -> frequency map 
        for(char ch: t.toCharArray()){
            if(seen2.containsKey(ch)){
                seen2.put(ch, seen2.get(ch) + 1);
            }else{
                seen2.put(ch, 1);
            }
        }

        //check if both the map has all the keys and also if they have same frequency 
        if(seen1.equals(seen2)){
            return true;
        }else {
            return false;
        }
    }
}
