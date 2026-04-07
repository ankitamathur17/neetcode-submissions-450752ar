class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>(nums.length);
        Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i]))
            return true;
        set.add(nums[i]);
       }
        
       
       return false;
    }
}