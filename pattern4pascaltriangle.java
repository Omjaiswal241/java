import java.util.*;
class Pattern4pascaltriangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no.");
        int n=sc.nextInt();
        int r,c;
        int val;
        for(r=0;r<n;r++)
        {
            val=1;
            for(c=0;c<=r;c++)
            {
                System.out.print(val);
                val=val*(r-c)/(c+1);
            }
            System.out.println();
        }
    }
        }



