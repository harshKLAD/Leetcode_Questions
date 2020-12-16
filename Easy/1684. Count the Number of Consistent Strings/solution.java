class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<Character>();
        int count = 0;

        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }

        for (String str : words) {
            boolean consistant = false;
            for (int i = 0; i < str.length(); i++) {
                if (!set.contains(str.charAt(i))) {
                    break;
                }
                if (i == str.length() - 1) {
                    consistant = true;
                }
            }
            if (consistant) {
                count++;
            }
        }

        return count;
    }
}