package Scalar;

public class DivigibleByEight {
    public static void main(String[] args) {
        String A="2216";
        System.out.println(solve(A));
    }
    private static int solve(String A) {
        int n=A.length();
        if(n<3){
            if(Integer.parseInt(A)%8==0){
                return 1;
            }
            return 0;
        }
        int sum=Integer.parseInt(A.substring(n-3,n));
        if(sum%8==0)return 1;
        return 0;
    }
}
