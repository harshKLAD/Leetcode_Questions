class Solution {
    public int numberOfMatches(int n) {
        if (n == 2) {
            System.out.println("2:" + 1);
            return 1;
        } else if (n == 1) {
            System.out.println("1:" + 0);
            return 0;
        } else if (n % 2 != 0) {
            System.out.println("odd " + n + " : " + (n / 2 + 1));
            return (n / 2) + numberOfMatches(n / 2 + 1);
        } else {
            System.out.println("even " + n + " : " + n / 2);
            return n / 2 + numberOfMatches(n / 2);
        }
    }
}