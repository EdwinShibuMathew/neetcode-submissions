class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int len = s.length();
        HashMap<Character,Integer>map = new HashMap<>();
    //  HashMap<Integer,Character>map = new HashMap<>();
        for(int i = 0; i<len; i++){ //populate map
            if(map.containsKey(s.charAt(i))){
                int inc = map.get(s.charAt(i));
                inc++;
                map.put(s.charAt(i),inc);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        for(int j = 0; j<len; j++){ //reduce/remove from map
            if(map.containsKey(t.charAt(j))&&map.get(t.charAt(j))>1){
                int inc = map.get(t.charAt(j));
                inc--;
                map.put(t.charAt(j),inc);
            }else if(map.containsKey(t.charAt(j))){
                map.remove(t.charAt(j));
            }else{return false;}
        }
        return true;
    }   
}
