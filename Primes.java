import java.util.ArrayList;

public class Primes
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        System.out.println(isPrime(7));
        System.out.println(makePrimes());
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
    public static ArrayList<Integer> makePrimes()
    {
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i = 2; i < 100; ++i)
        {
            if(isPrime(i))
                primes.add(i);
        }
        return primes;
    }
}