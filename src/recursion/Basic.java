package recursion;

public class Basic {
    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        System.out.println(addInt(5));
//        firstN(1,10);
//        printArrElements(0,new int[] {2,3,4,4});
        System.out.println(countDigits(5034));

    }
    static int factorial(int n){
        if(n==0 || n == 1) return 1;
        return  n * factorial(n-1);
    }
    static int addInt(int n){
        if (n == 1) return 1;
        return n + addInt(n-1);
    }
    static void firstN(int s,int n){
        if(s == n+1) return;
        System.out.print(s + " ");
        firstN(s+1,n);
    }
    static void printArrElements(int i , int[] arr){
        if(i == arr.length) return;
        System.out.print(arr[i] + " ");
        printArrElements(i+1,arr);
    }
    static int countDigits(int n){
        int ctr = 0;
        if (n>0){
            ctr++;
            countDigits(n/10);
        }
        return ctr;
    }
}
