class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        String[] words = s.trim().split("\\s+");
        return words[words.length - 1].length();
    }
}
