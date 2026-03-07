//string reverse
class StrRev 
{
    public static void main(String[] args) 
    {
        StringBuilder str=new StringBuilder("smaran");
        int n=str.length();
        String rev="";
        for(int i=0,j=n-1;i<n/2;i++,j--)
        {
            char temp=str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,temp);
        }
        System.out.println(str);
        
    }
}
