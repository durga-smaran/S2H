import java.util.*;
class Palindrome
{
     public static void main(String[] args) 
  {
         Scanner in=new Scanner(System.in);
         String s=in.next();
         StringBuilder s1=new StringBuilder(s);
         s1.reverse();
         String s3=s1.toString();
         if(s.equals(s3))
         System.out.println("It is a Palindrome");
         else{
            System.out.println("It is not a palindrome");
         }

     }
}
