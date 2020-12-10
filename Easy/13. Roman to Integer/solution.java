class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        map2.put("IV", 4);
        map2.put("IX", 9);
        map2.put("XL", 40);
        map2.put("XC", 90);
        map2.put("CD", 400);
        map2.put("CM", 900);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            sum = sum + map.get(s.substring(i, i + 1));

            if (i != s.length() - 1) {
                String str = s.substring(i, i + 2);

                if (map2.containsKey(str)) {

                    System.out.println(str);
                    System.out.println(map2.get(str));

                    sum = sum - map.get(s.substring(i, i + 1));
                    sum = sum + map2.get(str);

                    i++;
                }
            }

            System.out.println(sum);
        }

        return sum;
    }
}