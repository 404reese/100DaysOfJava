class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        if (digits[n-1]!=9){
            digits[n-1]+=1;
            return digits;
        }
    digits[n-1]=0;
    for (int i=n-2;i>=0;i--){
        
           if(digits[i]!=9){
               digits[i]=digits[i]+1;
               return digits;
           }
           digits[i]=0;
       }

       int[] ans = new int[n+1];
       ans[0]=1;
       return ans ;

    }
}