class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        if(strs.isEmpty()){
            return result.append("").toString();
        }
        for(String word : strs){
            result.append(word.length()).append("#").append(word);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if(str.isEmpty()){
            return result;
        }
        
        int i = 0;
        while(i < str.length()){
            int delimeterIndex = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, delimeterIndex));

            int start = delimeterIndex + 1;
            int end = start + len;

            result.add(str.substring(start, end));

            i = end;
        }
        return result;
    }
}
