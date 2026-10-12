class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] sArr = new int [26];

        for (int i = 0; i < s.length(); i++){
            sArr[s.charAt(i) - 'a']++;
            sArr[t.charAt(i) - 'a']--;
        }
        
        for(int num:sArr){
            if(num!=0) return false;
        }
        return true;
    }
}
