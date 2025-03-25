import java.util.*;
class Prime2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int i,c,k;
        for(i=1;i<=n;i++)
        {
            if(i==1)
            continue;
            c=0;
            for(k=2;k<i;k++)
            {
                if(i%k==0)
                c++;
            }
            if(c==0)
            System.out.println(i);
        }
    }
}