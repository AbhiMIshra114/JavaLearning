package easy;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(25));
//        System.out.println(sumOfN(5));

    }
    static long  factorial(int n){
        if (n<=1){
            return 1;
        }
        return n * factorial(n-1);
    }
    static long  sumOfN(int n){
        if (n<=1){
            return 1;
        }
        return n + sumOfN(n-1);
    }
}
