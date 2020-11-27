class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        if (nums[0] != 0) {
            return 0;
        } else if (nums[nums.length - 1] != nums.length) {
            return nums.length;
        }

        int out = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                out = i;
                break;
            }
        }
        return out;
    }
}