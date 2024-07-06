class Solution {
    public int passThePillow(int n, int time) {
        int cycle = n * 2 - 2;
        int remainingTime = time % cycle;
        
        if (remainingTime == 0) {
            return 1;
        }
        
        if (remainingTime <= n - 1) {
            return remainingTime + 1;
        } else {
            return n - (remainingTime - (n - 1));
        }
    }
}