class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> tab = new ArrayList<>();
        int Number = 0;

        if (s != null && s.length() > 0) {
            for (int i = 0; i < s.length(); i++) {
                char current = s.charAt(i);

              
                if (tab.contains(current)) {
              
                    Number = Math.max(Number, tab.size());

              
                    while (tab.get(0) != current) {
                        tab.remove(0);
                    }
                    tab.remove(0); 
                }

           
                tab.add(current);
            }

     
            Number = Math.max(Number, tab.size());
        }

        return Number;
    }
}