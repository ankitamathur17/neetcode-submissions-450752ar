class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res= new ArrayList <>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str= strs[i];
            char[] ch= str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(strs[i]);      
        }
        
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> indices = entry.getValue();
            List<String> group = new ArrayList<>();
            for (String index : indices) {
                group.add(index);
            }
            res.add(group);
        }

        return res;
    }
}