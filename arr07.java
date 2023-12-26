// Returning array from a method
public class arr07
    {
    public static void main(String args[])    
        {
            int matrix1[] = {10,20,30,40};
            int matrix2[] = {50,60,70,80};
            int matrix3[];
            matrix3 = sum(matrix1, matrix2);
            for(int i=0; i<matrix1.length; ++i)System.out.println(matrix3[i]);
        }
    public static int [] sum(int[] arr1, int[] arr2)
        {
            int add[] = new int[arr1.length];
            for(int i=0; i<arr1.length; ++i)add[i]=arr1[i]+arr2[i];
            return add;
        }
    }