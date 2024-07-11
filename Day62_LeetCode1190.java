class Solution {
    
    public static String reverse(String str){
        
        int n = str.length();
        String ans = "";
        for(int i = n - 1; i >= 0; i--){
            ans += str.charAt(i);
        }
        
        return ans;
    }
    
    public String reverseParentheses(String s) {
        
        int n = s.length();
        
        Stack<String> s2 = new Stack<>();
        
        String currString = "";
        
        for(int i = 0; i < n; i++){
            char curr = s.charAt(i);
            
            if(curr == '('){
                s2.push(currString);
                currString = "";
            }
            
            else if(curr == ')'){
                String reversed = reverse(currString);
                if(s2.size() > 0){
                    reversed = s2.pop() + reversed;
                }
                
                currString = reversed;
            }
            
            else{
                currString += curr;
            }
        }
        
        return currString;
        
    }
}