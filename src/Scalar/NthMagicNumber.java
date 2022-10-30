package Scalar;

public class NthMagicNumber {
    public static void main(String[] args) {
        int n=1;
        System.out.print(n +" :");
        printN(n);
        n++;
        System.out.println("**************************");
        System.out.print(n +" :");
        printN(n);
        n++;
        System.out.println("**************************");
        System.out.print(n +" :");
        printN(n);
        n++;
        System.out.println("**************************");
        System.out.print(n +" :");
        printN(n);
        n++;
        System.out.println("**************************");
        System.out.print(n +" :");
        printN(n);
        n++;
        System.out.println("**************************");
        System.out.print(n +" :");
        printN(n);
        n++;
        System.out.println("**************************");


    }

    private static void printN(int n){
        int ans = 0;
        int x = 1;
        while(n > 0) {
            x *= 5;
            if(n%2 == 1)   {
                ans += x;
            }
            n /= 2;
        }
        System.out.println(ans);// ans;
    }
}
