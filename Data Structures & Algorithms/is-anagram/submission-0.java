class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cs=s.toCharArray();
        Arrays.sort(cs);
        char[] ct=t.toCharArray();
        Arrays.sort(ct);

        String sortedS= new String(cs);
        String sortedT= new String(ct);

        if(sortedS.equals(sortedT))
            return true;
        else
        return false;
    }
}
