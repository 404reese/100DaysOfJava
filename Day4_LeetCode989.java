class Solution {
    public List<Integer> addToArrayForm(int[] a, int k) {
        List<Integer> ans = new ArrayList<>();

        int i = a.length - 1;
        int c = 0;

        while (i >= 0 || k > 0) {
            int s = c;
            if (i >= 0) {
                s += a[i--];
            }
            s += k % 10;
            c = s / 10;
            ans.add(0, s % 10);
            k /= 10;
        }
        if (c > 0) {
            ans.add(0, c);
        }
        return ans;
    }
}