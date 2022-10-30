package Scalar;

import java.util.Arrays;

public class NovelInteger {
    public static void main(String[] args) {
        int[]A={1, 2, 7, 0, 9, 3, 6, 0, 6};
        System.out.println(solve(A));
    }
    static int solve(int[] A) {

        int n=A.length;
        Arrays.sort(A);
        int count=0;

        if(A[n-1]==0){
            return 1;
        }

        for(int i=0;i<n-1;i++){

            if(A[i]==A[i+1]){
                continue;
            }
            if(A[i]==n-i-1){
                return 1;
            }
        }
        return -1;
    }
}
