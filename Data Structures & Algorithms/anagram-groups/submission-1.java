class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*
        Iterate through the array once. For each string: 
        1) Convert it to a char array, sort it, and turn it back into a string to use as a key. 
        2) Check if that key exists in your HashMap. If not, create a new ArrayList.
        3) Add the original string to the list associated with that key.
        Finally, return the values() of the map as your result.
        */

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
