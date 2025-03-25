import java.util.*;
class Selectionsort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no. of elements in array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j,t;
        System.out.println("Enter your array");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}