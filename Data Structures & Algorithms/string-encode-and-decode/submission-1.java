class Solution {

    public String encode(List<String> strs) {
        String res="";
        for(int i=0;i<strs.size();i++){
            res=res+strs.get(i).length()+'á'+strs.get(i);
        }
        return res; 
    }

    public List<String> decode(String str) {
        List<String> strs= new ArrayList<>(); int idx=0;
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='á'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            j++;
            strs.add(str.substring(j,j+len));
            i=j+len;
        }
        return strs;
    }
}
