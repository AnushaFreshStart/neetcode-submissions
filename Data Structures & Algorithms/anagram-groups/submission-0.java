class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        // Instead of sorting each string, build a 26‑length frequency array for each word.
        /*
          For "eat" → [1,0,0,0,1,0,...,1,...]. Convert that array into a key like: "1#0#0#0#1#0#...#1"
          This key uniquely identifies an anagram group.

          Sorting approach:
            For each string of length K → O(K log K). 
            Total → O(N·K log K). 
          Frequency approach:
            Count characters → O(K)
            Build key → O(26) = constant. Total → O(N·K). This is the fastest possible solution for this problem.
        */

        for (String str : strs) {
            int[] freq = new int[26];

            for (char c : str.toCharArray()) {
                freq[c - 'a']++;
            }

            // Build a unique key from frequency array
            StringBuilder sb = new StringBuilder();
            for (int f : freq) {
                sb.append(f).append('#');
            }
            String key = sb.toString();

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
