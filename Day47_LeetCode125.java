class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase(); // convert to lowercase
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c); // append alphanumeric characters
            }
        }
        String alphanumericStr = sb.toString();
        int left = 0, right = alphanumericStr.length() - 1;
        while (left < right) {
            if (alphanumericStr.charAt(left)!= alphanumericStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}