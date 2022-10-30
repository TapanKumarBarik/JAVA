package Scalar;

public class SubarrayOR {
    public static void main(String[] args) {
        int[]A={1,2,3,4,5};
        System.out.println(solve(A));
    }
    static int solve(int[] A) {

        int sum=0;
        int mod=1000000007;

        int n=A.length;

        for(int i=0;i<31;i++){


            int[]bytes=new int[n];
            for(int j=0;j<n;j++){
                bytes[j]=(A[j]>>i)&1;
            }

            int tempSum=calc(bytes,n, i);

            tempSum=tempSum%mod;

            sum=(sum%mod+tempSum%mod)%mod;
        }

        return (sum+mod)%mod;
    }

    static int calc(int[]arr, int n, int j){

        int totalSubArray=n*(n+1)/2;
        int consucativeZero=0;
        for(int i=0;i<n;i++){

            if(arr[i]==0){
                consucativeZero++;
            }
            if(arr[i]==1){
                int m=consucativeZero*(consucativeZero+1)/2;
                totalSubArray-=m;
                consucativeZero=0;
            }
        }
        if(consucativeZero!=0){
            int m=consucativeZero*(consucativeZero+1)/2;
            totalSubArray-=m;
        }
        return totalSubArray*(int)(Math.pow(2,j));
    }
}
