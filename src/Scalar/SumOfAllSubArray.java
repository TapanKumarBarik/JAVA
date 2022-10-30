package Scalar;

public class SumOfAllSubArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};

        int n=arr.length;

        for(int i=0;i<n;i++){
            int num=i;
            System.out.println("Subarray starting from index "+ num);
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                System.out.println(sum);
            }
        }
    }
}
