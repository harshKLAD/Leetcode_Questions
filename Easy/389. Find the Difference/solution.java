class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> set = new HashMap<Character, Integer>();
        
        for(int i = 0; i<s.length(); i++){
            if(set.containsKey(s.charAt(i))){
                set.put(s.charAt(i), set.get(s.charAt(i))+1);
            }else{
                set.put(s.charAt(i), 1);
            }
        }
        
        for(int j = 0; j<t.length(); j++){
            if(set.containsKey(t.charAt(j))){
                if(set.get(t.charAt(j)) > 0){
                    set.put(t.charAt(j), set.get(t.charAt(j)) - 1);
                }else{
                    return t.charAt(j);
                }
            }else{
                return t.charAt(j);
            }
        }
        
        return 'o';
    }
}