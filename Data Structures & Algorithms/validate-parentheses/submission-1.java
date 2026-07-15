class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : arr){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;

                if(c == ')' && stack.peek() != '(') return false;

                if(c == '}' && stack.peek() != '{') return false;

                if(c == ']' && stack.peek() != '[') return false;

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
