class Solution {
    public int findDuplicate(int[] nums) 
    {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums)
        {
            if(map.containsKey(i))
            return i;
            else
            {
                map.put(i,i);
            }
        }
        return -1;
        
    }
}