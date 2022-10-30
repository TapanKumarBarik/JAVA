package Scalar;

public class SunArrayWithBitZero {
    public static void main(String[] args) {
    int []arr0={0, 1, 0, 0, 0};
    int[]arr1={1, 0, 1};
    int[]arr2={1,0};
        System.out.println(solve(arr0,arr0.length));
        System.out.println(solve(arr1,arr1.length));
        System.out.println(solve(arr2,arr2.length));

    }
    private static int solve(int[]arr, int n){

        int sum=0;
        for(int i=0;i<n;i++){
            int xor=0;
            for(int j=i;j<n;j++){
                xor=xor | arr[j];
                if(xor==1){
                    sum++;
                }
            }
        }

        return sum;

    }
}
