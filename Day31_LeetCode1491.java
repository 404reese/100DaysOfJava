class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        int max = salary[0];
        int min = salary[0];
        int sum = salary[0];

        for (int i=1;i<n;i++) {
            if (max < salary[i]){
                max = salary[i];
            }
            if (min > salary[i]){
                min = salary[i];
            }
            sum += salary[i];
        }
        sum=sum-min-max;
        double ans = (double)sum/(n-2);
        return ans;
    }
}