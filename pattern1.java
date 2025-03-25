class Pattern1
{
    public static void main(String args[])
    {
        int i,k;
        for(i=0;i<5;i++)
        {
            if(i==0||i==5)
            System.out.println("*****");
            else
            for(k=4;k>1;k--)
            System.out.print(' ');
            for(k=0;k<=i;k++)
            System.out.print('*');
        
        System.out.println();
        }
        
    }
}