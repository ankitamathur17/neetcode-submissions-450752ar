class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap <Integer,Integer> map= new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(map.containsKey(nums[i])){
                 map.put(nums[i],map.get(nums[i])+1);
            } else{
                map.put(nums[i],1);
                }
        }

       PriorityQueue<Map.Entry<Integer,Integer>> pq= new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

      for( Map.Entry<Integer,Integer> entry: map.entrySet()){
        
        pq.offer(entry);

        if(pq.size()> k){
            pq.poll();
        }
      }
         int res[] = new int [k];
         int i=0;
         while(!pq.isEmpty()){
            res[i++]=pq.poll().getKey();
         }
        return res;
    }
}
