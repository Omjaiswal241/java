import java.util.*;
class Addarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter value of n");
        int n=sc.nextInt();

        System.out.println("Enter value of m");
        int m=sc.nextInt();

        int ar1[]=new int[n];
        int ar2[]=new int[m];

        System.out.println("Enter array1");
        for(int i=0;i<n;i++)
        {
            ar1[i]=sc.nextInt();
        }
        
        System.out.println("Enter array2");
        for(int i=0;i<m;i++)
        {
            ar2[i]=sc.nextInt();
        }
        int i=n-1;
        int j=m-1;
        int k=((n>m)?n:m)-1;
        int res[]=new int[k+2];
        int carry=0;
        while (i>=0 || j>=0|| carry!=0) {
            int val=carry;
            if(i>=0){
                val+=ar1[i];
                i--;
            }
            if(j>=0)
            {
                val+=ar2[j];
                j--;
            }
            res[k]=(val%10);
            carry=(val/10);
            k--;
        }
        System.out.println("End result");
        int g=(res[0]==0)?1:0;
        for(int f=g;g<k+2;k++)
        {
        System.out.println(res[f]);
        }
    }
}
