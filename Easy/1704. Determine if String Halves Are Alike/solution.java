class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> set = new HashSet();

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        // set.add('A');
        // set.add('E');
        // set.add('I');
        // set.add('O');
        // set.add('U');

        int countA = 0;
        int countB = 0;

        for (int i = 0; i < s.length() / 2; i++) {
            if (set.contains(Character.toLowerCase(s.charAt(i)))) {
                countA++;
            }

            if (set.contains(Character.toLowerCase(s.charAt(i + s.length() / 2)))) {
                countB++;
            }
        }

        return countA == countB;
    }
}