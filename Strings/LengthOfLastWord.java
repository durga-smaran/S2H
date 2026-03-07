public class LengthOfLastWord 
{
    public static void main(String[] args) 
    {
        String str="laxmikanth is a topper student";
        String[] s=str.split(" ");
        int l=s.length;
        System.out.println("Length of "+s[l-1]+" is "+s[l-1].length());
    }
}
