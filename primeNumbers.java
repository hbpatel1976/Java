public class primeNumbers 
{
    public static void main(String[] args) 
        {
            for(int i=2; i<100; ++i)isPrime(i);
	}
    public static void isPrime(int n) 
        {
            boolean prime=true;
            for (int i = 2; i <= n / 2; i++)if (n % i == 0)prime = false;
            if(prime==true)System.out.print(" "+n);
	}
}