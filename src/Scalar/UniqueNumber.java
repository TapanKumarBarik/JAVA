package Scalar;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] A={1, 2, 3, 1, 2, 4};
        int n=A.length;
        int xor=0;
        for (int i=0;i<n;i++){
            xor^=A[i];
        }
        int msb=xor & -xor;
        System.out.println(msb);
        int xor1=0;
        int xor2=0;

        for(int i=0;i<n;i++){
            if((A[i]&msb)==0 ){
                xor1^=A[i];
            }
            else{
                xor2^=A[i];
            }
        }
        int []arr=new int[2];
        arr[0]=Math.min(xor1,xor2);
        arr[1]=Math.max(xor1,xor2);


    }
}
