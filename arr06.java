// Passing array to a method
public class arr06
    {
    public static void main(String args[])    
        {
            int matrix[] = {10,20,30,40};
            int ans = sum(matrix);
            System.out.println(ans);
        }
    public static int sum(int[] arr)
        {
            int sum=0;
            for(int i=0; i<arr.length; ++i)sum+=arr[i];
            return sum;
        }
    }