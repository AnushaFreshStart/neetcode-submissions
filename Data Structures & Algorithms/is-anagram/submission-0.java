class Solution {
    public boolean isAnagram(String s, String t) {
        if( s.length() != t.length())
            return false;

        HashMap<Character, Integer> countMapS = new HashMap<>();
        for(char c : s.toCharArray()){
            int countC = countMapS.getOrDefault(c, 0);
            countMapS.put(c, countC + 1);
        }

        HashMap<Character, Integer> countMapT = new HashMap<>();
        for(char c : t.toCharArray()){
            int countC = countMapT.getOrDefault(c, 0);
            countMapT.put(c, countC + 1);
        }

        for(Character i : countMapS.keySet()){
            if(!countMapS.get(i).equals(countMapT.get(i)))
              return false;        
        }
        return true;

    }
}

