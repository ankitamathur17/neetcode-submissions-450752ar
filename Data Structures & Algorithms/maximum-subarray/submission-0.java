class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0]; int curSum=0;        //   sum =-1  curSum=0
        for(int i=0;i<nums.length;i++){  //  -1 2 -1 5
            if(curSum <0)
                curSum=0;  //i=1, cs=0, 
            curSum=curSum+nums[i]; //cs=-1 ; cs=2; ;cs=1; 1+5=6
            if(curSum>sum){  //false  ,2>-1 true sum=2 ; false ; sum=6
                sum=curSum;
            }
        }
        return sum;
    }
}
