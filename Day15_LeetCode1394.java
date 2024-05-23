class Solution {
    public int findLucky(int[] a) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int n : a) {
            m.put(n, m.getOrDefault(n, 0) + 1);
        }
        
        int l = -1;
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            if (e.getKey() == e.getValue()) {
                l = Math.max(l, e.getKey());
            }
        }
        
        return l;
    }
}