
class Solution {
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            // Store the length of the string followed by a special delimiter
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        
        while (i < s.length()) {
            // Find the delimiter to know where the length part ends
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }
            
            // Extract the length of the next string
            int length = Integer.parseInt(s.substring(i, j));
            
            // Move pointer to the start of the actual string
            i = j + 1;
            
            // Extract the string based on the parsed length
            res.add(s.substring(i, i + length));
            
            // Move pointer to the start of the next length segment
            i += length;
        }
        
        return res;
    }
}
