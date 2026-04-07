class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res= new ArrayList <>();
        HashMap<String,List<Integer>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str= strs[i];
            char[] ch= str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            List<Integer> retrieve =map.get(key);
               if (retrieve == null) {
                    retrieve = new ArrayList<>();
                
                }
                retrieve.add(i);
                map.put(key,retrieve);
            
        }
        
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            List<Integer> indices = entry.getValue();
            List<String> group = new ArrayList<>();
            for (Integer index : indices) {
                group.add(strs[index]);
            }
            res.add(group);
        }

        return res;
    }
}