class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;
        char[] cs=s.toCharArray();
        Arrays.sort(cs);
        char[] ct=t.toCharArray();
        Arrays.sort(ct);
        return Arrays.equals(cs,ct);
    }
}
