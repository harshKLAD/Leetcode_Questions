class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Double> set = new HashSet<Double>();

        for (int ele : arr) {
            if (set.contains(2 * (double) ele) || set.contains((double) ele / 2)) {
                System.out.println(ele);
                return true;
            } else {
                set.add((double) ele);
                System.out.println((double) ele);
            }
        }
        return false;
    }
}