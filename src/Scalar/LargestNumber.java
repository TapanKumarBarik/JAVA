package Scalar;

import java.util.ArrayList;

public class LargestNumber {
    public static void main(String[] args) {
    int[]arr={9, 5, 34, 3, 30};
    largestNumber(arr);
    }
    static void largestNumber(final int[] A) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < A.length; i++) {
            arr.add(A[i]);
        }

        arr.sort((a, b) -> ("" + b + a).compareTo("" + a + b));

    }
}
