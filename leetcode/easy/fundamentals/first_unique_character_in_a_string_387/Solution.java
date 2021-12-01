class Solution {
    public int firstUniqChar(String s) {
        
        if (s.length()==1) return 0;
        
        int start = 0;
        int end = s.length()-1;
        HashSet<Character> hashSet = new HashSet<>();
        
        while (start<s.length()) {
            if (hashSet.contains(s.charAt(start))) {
                start++;
                continue;
            }
            
            // duplicate encountered
            if (s.charAt(start) == s.charAt(end)) {
                // last element is the first non duplicate
                if (start==s.length()-1) {
                        return start;
                }
                hashSet.add(s.charAt(start));
                start++;
                end = s.length()-1;
                continue;
            }
            
            // first element is the first non duplicate
            if (start==end-1) {
                return start;
            }
            end--;
        }
        
        
        return -1;
    }
}
