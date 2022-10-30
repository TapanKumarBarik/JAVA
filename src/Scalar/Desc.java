package Scalar;

public class Desc {
    public static void main(String[] args) {
        int n=60;
        solve(n);
    }
    static void solve(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        solve(n-1);

    }
}
