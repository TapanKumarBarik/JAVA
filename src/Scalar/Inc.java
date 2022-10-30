package Scalar;

public class Inc {
    public static void main(String[] args) {
        int n=60;
        solve(n);
    }
    static void solve(int n){
        if(n==0){
            return;
        }
        solve(n-1);
        System.out.println(n);
    }
}
