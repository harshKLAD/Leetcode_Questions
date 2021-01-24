class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int total = numBottles;
        int out = numBottles;

        while (total >= numExchange) {
            out = out + total / numExchange;
            total = total % numExchange + total / numExchange;

            System.out.println(out + " : " + total);
        }
        return out;
    }
}