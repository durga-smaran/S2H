class Solution {
    public int subtractProductAndSum(int n) 
    {
        int a=1,b=0;
        while(n!=0)
        {
            int rem=n%10;
            a*=rem;
            b+=rem;
            n/=10;
        }    
        return a-b;
    }
}