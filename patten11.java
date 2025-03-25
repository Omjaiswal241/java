import java.util.*;
class Pattern11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int r,c;
        for(r=1;r<=n;r++)
        {
            for(c=1;c<=n;c++)
            {
                if(c==1||c==n)
                System.out.print("*\t");
                else if(r+c==n+1&&r>=(n+1)/2)
                System.out.print("*\t");
                else if(r==c&&r>=(n+1)/2)
                System.out.print("*\t");
                else
                System.out.print("\t");
            }
            System.out.println();
            
        }
    }
}