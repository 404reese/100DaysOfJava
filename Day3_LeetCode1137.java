class Solution {
    public int tribonacci(int n) {
        if (n<2) {
            return n;
        }
        int n1=0;
        int n2=1;
        int n3=n2;
        if(n==2){
            return n2;
        }
        for (int i=3; i<=n; i++) {
            int n4 = n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=n4;
        }
        return n3;
    }
}