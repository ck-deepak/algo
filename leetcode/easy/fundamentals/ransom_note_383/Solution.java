class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // character and frequency count
        HashMap<Character, Integer> hashMap = new HashMap<>();
        
        for (int i=0; i<magazine.length(); i++) {
            if (hashMap.containsKey(magazine.charAt(i))) {
                hashMap.put(magazine.charAt(i), hashMap.get(magazine.charAt(i))+1);
            } else {
                hashMap.put(magazine.charAt(i), 1);
            }
        }
        
        for(int i=0; i<ransomNote.length(); i++) {
            if(hashMap.containsKey(ransomNote.charAt(i)) && hashMap.get(ransomNote.charAt(i))>0) {
                hashMap.put(ransomNote.charAt(i), hashMap.get(ransomNote.charAt(i))-1);
            } else {
                return false;
            }
        }
        
        return true;
    }
}
