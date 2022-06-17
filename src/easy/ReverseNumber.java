package easy;

public class ReverseNumber {
    public static void main(String[] args) {
//        System.out.println(reverse(1842));
        int n = 1842;
        if (n == reverse(n))
            System.out.println("yes");
        else
            System.out.println("no");
    }
    static int reverse(int n){
        if (n%10 == n) {
            System.out.print(n);
            return n;
        }
        System.out.print(n%10);
        return reverse(n/10);
    }
}
