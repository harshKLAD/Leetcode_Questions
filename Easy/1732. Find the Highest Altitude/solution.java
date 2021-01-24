class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length+1];
        
        altitude[0] = 0;
        int out = 0;
        
        for(int i = 0; i<gain.length; i++){
            altitude[i+1] = altitude[i] + gain[i];
            out = Math.max(out, altitude[i+1]);
        }
        
        return out;
    }
}