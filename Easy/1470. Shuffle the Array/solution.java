class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] out = new int[nums.length];
        int size = nums.length/2;
        int index = 0;
        
        for(int i = 0; i < size; i++){
            out[index] = nums[i];
            index++;
            out[index] = nums[size+i];
            index++;
        }
    return out;    
    }
}