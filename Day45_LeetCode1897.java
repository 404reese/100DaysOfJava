import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        for (int count : charCount.values()) {
            if (count % words.length!= 0) {
                return false;
            }
        }

        return true;
    }
}
