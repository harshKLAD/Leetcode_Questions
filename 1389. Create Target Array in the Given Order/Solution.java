class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            list.add(index[i], nums[i]);
        }
        
        //System.out.println(list);
        int[] out = new int[list.size()];
        
        for(int j = 0; j < list.size(); j++){
            out[j] = (Integer)list.get(j);
        }
        
        return out;
    }
}