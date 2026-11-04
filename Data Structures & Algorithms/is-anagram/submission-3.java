class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        char[] Array_S = s.toCharArray();
        char[] Array_T = t.toCharArray();

        Arrays.sort(Array_S);
        Arrays.sort(Array_T);

        return Arrays.equals(Array_S, Array_T);
    }
}
