// Cloning an array
public class arr08
    {
    public static void main(String args[])    
        {
            int Matrix[] = {10,20,30,40};
            int copiedMatrix [] = Matrix.clone();
            for(int i=0; i<Matrix.length; ++i)System.out.println(copiedMatrix[i]);
        }
    }