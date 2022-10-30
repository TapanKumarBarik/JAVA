package Scalar;

import java.util.Arrays;

public class SubarrayWithSumB {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int B=5;
        System.out.println(Arrays.toString(solve(arr,B)));
    }
    static int[] solve(int[] A, int B) {
        int n=A.length;
        int start=0;
        int end=0;

        int flag=1;
        for(int i=0;i<n;i++){
            int sum1=0;

            if(flag!=0){
                for(int j=i;j<n;j++){
                    sum1+=A[j];
                    if(sum1>B){
                        sum1=0;
                        break;
                    }
                    if(sum1==B){
                        start=i;
                        end=j;
                        flag=0;
                        break;
                    }

                }
            }

        }

        if(start==0 && end==0){
            int[]arr=new int[1];
            arr[0]=-1;
            return arr;
        }

        int[]arr=new int[end-start+1];
        int index=0;
        for(int i=start;i<=end;i++){
            arr[index]=A[i];
            index++;
        }

        return arr;
    }
}
