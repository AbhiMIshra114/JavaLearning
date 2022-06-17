package practise;

public class Primorial {
    public static void main(String[] args) {
        System.out.println(primorial(5));
    }
    static long primorial(long n){
        if (n<=1){
            return 1;
        }
        if (isPrime(n)){
            return n*factorial(n);
        }
        return 0;
    }
    static long  factorial(long n){
        if (n<=1){
            return 1;
        }
        return n * factorial(n-1);
    }
    static  boolean isPrime(long n){
        if (n<=1)
            return false;
        int c = 2;
        while ((long) c *c <= n){
            if (n%c==0)
                return false;
            c++;
        }
        return true;
    }
}
