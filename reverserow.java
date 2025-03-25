import java.util.Arrays;
class Reverserow
{
    // public static void main(String args[])
    // {
    //     int ar[]={1,2,3,4,5};
    //     int k=-2;
    //     System.out.println(Arrays.toString(reverse(ar,k)));
    // }
    // public static int[] rotate(int ar[],int left,int right)
    // {
    //     while(left<right)
    //     {
    //         int temp=ar[left];
    //         ar[left]=ar[right];
    //         ar[right]=temp;
    //         left++;
    //         right--;
    //     }
    //     return ar;
    // }
    // public static int[] reverse(int ar[],int k)
    // {
    //     int n=ar.length;
    //     k=k%n;
    //     if(k<0)
    //     {
    //         k=n+k;
    //     }
    // rotate(ar,0,n-1);

    // rotate(ar,0,k-1);
        
    // rotate(ar,k,n-1);
    //     return ar;
    public static void main(String args[])
    {
        int ar[]={2,4,3,1,0};
        System.out.println(Arrays.toString(inverse(ar)));
    }
    public static int[] inverse(int ar[])
    {
        int n=ar.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int val=ar[i];
            res[val]=i;
        }
        return res;
    }
}