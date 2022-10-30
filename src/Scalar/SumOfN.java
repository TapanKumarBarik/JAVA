package Scalar;

public class SumOfN {
    public static void main(String[] args) {
        int n=10;
        System.out.println(solve(n));
    }
    private static int solve(int n){
        if(n==0){
            return n;
        }
        return n+solve(n-1);
    }
}
