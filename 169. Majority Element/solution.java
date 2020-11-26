class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> Hmap = new HashMap<Integer, Integer>();
        int max = 0;
        int out = 0;

        for (Integer ele : nums) {
            if (Hmap.containsKey(ele)) {
                Hmap.put(ele, Hmap.get(ele) + 1);
            } else {
                Hmap.put(ele, 1);
            }
        }

        for (Integer i : Hmap.keySet()) {
            if (max < Hmap.get(i)) {
                max = Hmap.get(i);
                out = i;
            }
        }
        return out;
    }
}