class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int max = 0;
        int[] sorted = new int[points.length];

        for (int i = 0; i < points.length; i++) {
            sorted[i] = points[i][0];
        }

        Arrays.sort(sorted);

        for (int i = 1; i < points.length; i++) {
            max = Math.max(max, Math.abs(sorted[i] - sorted[i - 1]));
        }

        return max;
    }
}