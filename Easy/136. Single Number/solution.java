class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hSet = new HashSet<Integer>();

        for (int ele : nums) {
            if (hSet.contains(ele)) {
                hSet.remove(ele);
            } else {
                hSet.add(ele);
            }
        }

        int out = 0;

        for (int S : hSet) {
            out = S;
        }

        return out;
    }

}
