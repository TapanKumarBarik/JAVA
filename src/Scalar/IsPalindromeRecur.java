package Scalar;

public class IsPalindromeRecur {
    public static void main(String[] args) {
        char[]arr={'t','a','p','a','n','n','a','p','a','t'};
        int ans=solve(arr,0, arr.length-1);
        System.out.println(ans);
    }
    static int solve(char[]arr, int start, int end){
        if(start>end){
            return 1;
        }
        if(arr[start]==arr[end]){
            return solve(arr,start+1, end-1);
        }else{
            return 0;
        }
    }
}
