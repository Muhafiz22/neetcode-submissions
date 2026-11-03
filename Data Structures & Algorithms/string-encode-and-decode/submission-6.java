class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();

        for(String str: strs){
            encodedStr.append(str.length()).append("#").append(str);
        }
        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStr = new ArrayList<>();
        
        if(str.isEmpty()) return decodedStr;

        int i = 0;
        while(i < str.length()){
            int delimeterIndex = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, delimeterIndex));
            
            int start = delimeterIndex + 1;
            int end = start + length;

            decodedStr.add(str.substring(start, end));
            i = end;
        }
        return decodedStr;
    }
}
