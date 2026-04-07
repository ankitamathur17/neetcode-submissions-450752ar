class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0)
            return 0;
        int count=1,finalcount=1; int j=1;
        for(int i=0;j<nums.length;i++,j++){ //0,1,1,2,3,4,5,6
            if (nums[j]==nums[i]+1 || nums[j]==nums[i]){
                if(nums[j]==nums[i]){
                    continue;
                }
                count++; 
            }else{
                if(count>finalcount){
                    finalcount=count;
                }
                
                count=1;
            }
            System.out.println("i="+i+"j="+j+"count="+count+"final="+finalcount);
        }
        if(count>finalcount){
                    finalcount=count;
                }
        return finalcount;
    }
}
