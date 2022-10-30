package Scalar;

public class PrintArrayInReverseOrder {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        solve(arr,arr.length-1);
    }
    private static void solve(int[]arr, int n){

        if(n==-1){
            return;
        }
        System.out.println(arr[n]);
        solve(arr,n-1);

    }
}
