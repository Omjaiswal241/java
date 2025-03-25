import java.util.*;
class Table
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,c=1;
        for(i=1;i<=n;i++)
        {
        c=n*i;
        System.out.println(n+"*"+i+"="+c);}
    }
}