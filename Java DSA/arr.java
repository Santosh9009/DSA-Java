public class arr
{
    public static void main(String[] args)
    {
        int a[]={3,4,6,2};
        int b[]=new int[5];
        for(int i=0;i<4;i++)
        {
            if(a[i]<a[i+1])
            b[i]=a[i];
            else
            a[i]=a[i+1];
        }
    }
}