package Scalar;

import java.util.Arrays;

public class MultipleLeftRotationOfArray {
    public static void main(String[] args) {
    int[]A={1,2,3,4,5};
    int []B={2,3};
    solve(A,B);
    }
    public static void solve(int[] A, int[] B) {

        int n=B.length;
        int m=A.length;
        int[][]arr=new int[n][m];

        for(int i=0;i<n;i++){
            int[]temp=new int[m];

            int b=B[i]%m;
            int index=0;
            for(int j=b;j<m;j++){
                temp[index]=A[j];
                index++;
            }
            for(int j=0;j<b;j++){
                temp[index]=A[j];
                index++;
            }
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
