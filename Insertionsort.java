import java.util.*;
class Insertionsort
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
        for(i=1;i<n;i++)
        {
            t=a[i];
            j=i-1;
            while(j>=0 && a[j]>t)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=t;
        }
        for(i=0;i<n;i++)
        System.out.println(a[i]);
    }
}