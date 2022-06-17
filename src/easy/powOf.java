package easy;

public class powOf {
    public static void main(String[] args) {
        System.out.println(calcPow(2,6));
    }
    static int calcPow(int x, int n){
        if (x==0)
            return 0;
        if (n==0)
            return 1;
//        return x * calcPow(x,n-1);
        // when n is even
        if (n % 2 == 0)
            return calcPow(x,n/2) * calcPow(x,n/2);
        else
            return calcPow(x,n/2) * calcPow(x,n/2) * x;
    }

}
