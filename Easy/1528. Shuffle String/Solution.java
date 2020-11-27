class Solution {
    public String restoreString(String s, int[] indices) {
        char[] out = new char[s.length()];
        char[] s2 = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            out[indices[i]] = s2[i];
        }

        return new String(out);
    }
}