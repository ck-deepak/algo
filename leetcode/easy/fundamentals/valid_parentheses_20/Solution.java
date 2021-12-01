class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        if (s.length() == 1) return false;
        
        for (int i=0; i<s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == ')' && stack.size()>0 && stack.pop()=='(') {
               continue;
            } else if (cur == ']' && stack.size()>0 && stack.pop()=='[') {
               continue;
            } else if (cur == '}' && stack.size()>0 && stack.pop()=='{') {
               continue;
            } else {
                stack.add(cur);
            }
        }
        return stack.size()==0;
    }
}
