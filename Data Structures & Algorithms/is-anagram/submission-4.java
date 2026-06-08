class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> seen1 = new HashMap<>();
        HashMap<Character, Integer> seen2 = new HashMap<>();

        for(char ch: s.toCharArray()){
            if(seen1.containsKey(ch)){
                seen1.put(ch, seen1.get(ch) + 1);
            }else{
                seen1.put(ch, 1);
            }
        }

        for(char ch: t.toCharArray()){
            if(seen2.containsKey(ch)){
                seen2.put(ch, seen2.get(ch) + 1);
            }else{
                seen2.put(ch, 1);
            }
        }

        // for(char key: seen1.keySet()){
        //     if(seen2.containsKey(key) && seen1.get(key) != seen2.get(key))
        //     return false;
        // }

        // for(char key: seen2.keySet()){
        //     if(seen1.containsKey(key) && seen2.get(key) != seen1.get(key))
        //     return false;
        // }
        if(seen1.equals(seen2)){
            return true;
        }else {
            return false;
        }
    }
}
