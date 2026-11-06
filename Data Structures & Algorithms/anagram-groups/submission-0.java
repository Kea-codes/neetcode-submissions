class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            // Sort the characters to make the anagram "signature"
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Add this string to the group for its key
            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<>());
            }
            groups.get(key).add(strs[i]);
        }

        return new ArrayList<>(groups.values());
    }
}
