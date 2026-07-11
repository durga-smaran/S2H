class Solution 
{
    public int trap(int[] height) 
    {
        int rain=0,n=height.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        for(int i=0,j=n-1;i<n;i++,j--)
        {
            if(i==0)
            {
                prefix[i]=height[i];
                suffix[j]=height[j];
                continue;
            }
            prefix[i]=height[i]>prefix[i-1]?height[i]:prefix[i-1];
            suffix[j]=height[j]>suffix[j+1]?height[j]:suffix[j+1];
        }
        for(int i=1;i<n-1;i++)
        {
            rain+=Math.min(prefix[i],suffix[i])-height[i];
        }
        return rain;
    }
}