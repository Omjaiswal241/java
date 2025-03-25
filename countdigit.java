import java.util.*;
class Countdigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no.");
        int n=sc.nextInt();
        int i,d,c=0;
        while(n>0)
        {
            d=n%10;
            c++;
            n=n/10;
        }
        System.out.println("no. of digits"+c);
    }
}