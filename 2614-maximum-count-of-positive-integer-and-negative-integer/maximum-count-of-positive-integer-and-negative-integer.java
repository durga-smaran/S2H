class Solution {
    public int maximumCount(int[] nums) 
    {
        int neg=0,i,n=nums.length;
        for(i=0;i<n&&nums[i]<1;i++)
        {
            if(nums[i]<0) neg++;
        }
        int pos=n-i;
        return neg>pos?neg:pos;

    }
}