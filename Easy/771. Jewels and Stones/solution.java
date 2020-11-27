class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> Jewels = new HashMap<Character, Integer>();
        int counter = 0;

        for (int i = 0; i < J.length(); i++) {
            Jewels.put(J.charAt(i), 1);
        }

        for (int j = 0; j < S.length(); j++) {
            if (Jewels.get(S.charAt(j)) != null) {
                counter++;
            }
            ;
        }
        return counter;
    }
}