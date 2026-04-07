class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>(nums.length);

       for(int i=0;i<nums.length;i++){
        if(!set.contains(nums[i]))
            set.add(nums[i]);
        else
            break;
       }

       if(nums.length==set.size())
            return false;
       else
       return true;

    }
}