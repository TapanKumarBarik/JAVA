package Scalar;

import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int []nums={1,2,3,4,5};
        int n=nums.length;
        //left array

        int []left=new int[n];

        int p=1;
        for(int i=0;i<n;i++){
            p*=nums[i];
            left[i]=p;

        }
        System.out.println("Printing left ***********");
        System.out.println(Arrays.toString(left));

        //right array concept

        int []right=new int[n];

        p=1;

        for(int i=n-1;i>=0;i--){
            p*=nums[i];
            right[i]=p;

        }
        System.out.println("Printing right ***********");
        System.out.println(Arrays.toString(right));

        int []arr=new int[n];

        arr[0]=right[1];
        arr[n-1]=left[n-2];


        for(int i=1;i<n-1;i++){
            arr[i]=left[i]* right[i];
        }
        //[1 2 3 4,5]
        //STEP 1 left array //[1 2 6 24 120]
        //Step 2 right array//[120 120 60 20 5]

        //**********
        //STEP 1 left array //[1 2 6
        //Step 2 right array// 60 20 5]
        //ANS//[120  24]
        //left//[1,   2,   6,  24, 120]
        //right//[120, 120, 60,  20, 5]
        // return left;
        //[1,2,6,24]

        //return right;
        //[24,24,12,4]

    }
}
