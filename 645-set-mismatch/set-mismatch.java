class Solution {
    public int[] findErrorNums(int[] nums) 
    {
        int sum=0,n=nums.length;
        int[] arr=new int[2];
        Set<Integer> set=new HashSet<>(); 
        for(int i:nums)
        {
            if(set.contains(i))
            {
                arr[0]=i;
            }
            else
            {
                set.add(i);
                sum+=i;
            }
        }  
        int req=(n*(n+1)/2)-sum;
        arr[1]=req;
        return arr;
    }
}