class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < paths.size(); i++) {
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }

        String str = paths.get(0).get(0);

        while (true) {
            if (map.containsKey(str)) {
                str = map.get(str);
            } else {
                return str;
            }
        }
    }
}