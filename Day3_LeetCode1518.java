class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;
        while (numBottles >= numExchange){
            int a = numBottles/numExchange;
            int b = numBottles%numExchange;
            drink = drink +a;
            numBottles = a + b;
        }
        return drink;
    }
}