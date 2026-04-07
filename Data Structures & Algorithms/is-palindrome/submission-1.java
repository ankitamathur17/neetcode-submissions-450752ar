class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replace(" ","");
        System.out.println(s);
        String newstr="";
        for(int i=0;i<s.length();i++){
            if(!(s.charAt(i)>='a' && s.charAt(i)<='z')&& !(s.charAt(i)>='0' && s.charAt(i)<='9')){
                continue;
            }else{
                newstr=newstr+s.charAt(i);
            }
        }
        System.out.println(newstr);
        for(int i=0,j=newstr.length()-1;i<newstr.length()&&i!=j;i++,j--){
            if(newstr.charAt(i)!=newstr.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
