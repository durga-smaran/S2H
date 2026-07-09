class Solution {
    public int longestConsecutive(int[] nums) 
    {
        int count=0,maxc=0;
        Set<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }    
        for(int i:set)
        {
            if(!set.contains(i-1))
            {
                int curr=i;
                count=1;
                while(set.contains(++curr))
                {
                    count++;
                }
            }
            maxc=Math.max(maxc,count);
        }
        return maxc;
    }
}