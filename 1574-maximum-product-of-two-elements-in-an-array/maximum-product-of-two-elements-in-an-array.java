class Solution {
    public int maxProduct(int[] nums) 
    {
        int first_large=0,second_large=0;  
        for(int i:nums)
        {
            if(i>first_large)
            {
                second_large=first_large;
                first_large=i;
            }
            else if(i>second_large)
            {
                second_large=i;
            }
        }
        return (first_large-1)*(second_large-1);
    }
}