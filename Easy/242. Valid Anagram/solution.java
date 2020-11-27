class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        } else {
            char[] sChar = s.toCharArray();
            char[] tChar = t.toCharArray();

            Arrays.sort(sChar);
            Arrays.sort(tChar);

            String s1 = String.valueOf(sChar);
            String t1 = String.valueOf(tChar);

            if (s1.equals(t1)) {
                return true;
            } else {
                return false;
            }

            // for(char ele : sChar){
            // System.out.println(ele);
            // }

            // System.out.println(" ");

            // for(char ele : tChar){
            // System.out.println(ele);
            // }
        }
    }
}