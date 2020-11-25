class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        
        for(int i = 0; i < nums.length; i = i+2){
            size = size + nums[i];
        }
                
        int[] out = new int[size];
        int index = 0;
        
        for(int j = 0; j < nums.length; j = j+2){
            
        Arrays.fill(out, index, index+nums[j], nums[j+1]);
        index = index+nums[j];    
        }
        
        // int[] out2 = new int[size];
        // out2 = out.toArray(out2);
        
            
        return out;
    }
}