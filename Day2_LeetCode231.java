class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n<1) {
            return false;
        }
        while (n%2==0){
            n=n/2;
        }
        if (n==1){
            return true;
        } else {
            return false;
        }
    }
}