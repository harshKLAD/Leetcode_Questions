class Solution {
    public int countNegatives(int[][] grid) {

        int a = grid[0].length;
        int b = grid.length;

        System.out.print(a + " " + b);

        int count = 0;

        for (int i = b - 1; i > -1; i--) {
            for (int j = a - 1; j > -1; j--) {
                if (grid[i][j] < 0) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}