class Solution {
    public int numUniqueEmails(String[] emails) {
        int numEmails = emails.length;
        HashSet<String> hashSet = new HashSet<>();
        int count = 0;
        
        for (int i=0; i<numEmails; i++) {
            String s = emails[i];
            String local = "";
            String domain = "";
            boolean plusEncountered = false;
            for (int j=0; j<s.length(); j++) {
                char cur = s.charAt(j);
                if (cur == '@') {
                    domain = s.substring(j, s.length()-1);
                    break;
                }
                
                if (cur == '+') {
                    plusEncountered = true;
                    continue;
                }
                
                if (!plusEncountered && cur!='.') {
                    local = local + cur;
                }
            }
            s = local + domain;
            if (!hashSet.contains(s)) count++;
            hashSet.add(s);
        }
        return count;
    }
}
