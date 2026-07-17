class Solution {
    public int maxSum(int[] nums) 
    {
        Map<Integer,List<Integer>> map=new HashMap<>();
        int maxSum=0;
        for(int i:nums)
        {
            int a=i;
            int max=i%10;
            while(i!=0)
            {
                if(i%10>max) max=i%10;
                i/=10;
            }
            if(map.containsKey(max))
            {
                map.get(max).add(a);
            }
            else
            {
                map.put(max,new ArrayList<>());
                map.get(max).add(a);
            }
        }
        for(List<Integer> list:map.values())
        {
            Collections.sort(list);
            int len=list.size();
            if(len<=1) continue;
            int sum=list.get(len-1)+list.get(len-2);
            if(sum>maxSum) maxSum=sum;
        }
        return maxSum==0?-1:maxSum;
    }
}