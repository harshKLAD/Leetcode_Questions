class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
        int counter = 0;
        
        for(int i = 0; i< nums.length; i++){
            if(set.get(nums[i]) != null){
                set.put(nums[i],set.get(nums[i])+1);
                counter = counter+set.get(nums[i])-1;
            }else{
                set.put(nums[i],1);
            }
        }
        return counter;
    }
}