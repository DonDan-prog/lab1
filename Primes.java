public class Primes
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        System.out.println(isPrime(7));
    }
    public static boolean isPrime(int n)
    {
        for(int i = 2; i < n; ++i)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}