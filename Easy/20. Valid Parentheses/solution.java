class Solution {
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<Character>();

        HashMap<Character, Character> map = new HashMap<Character, Character>();

        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        if (map.containsKey(s.charAt(0))) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch) && stack.size() > 0) {
                if (stack.get(stack.size() - 1) == map.get(ch)) {
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
            } else {
                stack.add(ch);
            }
        }

        if (stack.size() != 0) {
            return false;
        } else {
            return true;
        }
    }
}