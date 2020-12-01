class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        int max = 0;
        int count = 0;
        char out ='a';
        
        for(int i = 0; i < releaseTimes.length; i++){
            map.put(keysPressed.charAt(i),releaseTimes[i]-count);
            System.out.println(releaseTimes[i]-count);
            
            if(max < releaseTimes[i]-count){
                max = releaseTimes[i]-count;
                out = keysPressed.charAt(i);
            }
            if(max == releaseTimes[i]-count){
                if((int) out < (int) keysPressed.charAt(i)){
                        out = keysPressed.charAt(i);
                }
            }
            
            count = releaseTimes[i];
        }
        
        return out;  
    }
}