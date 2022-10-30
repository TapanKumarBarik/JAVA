package Scalar;

import java.util.ArrayList;

public class Rotate2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A=new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
    A.add(arr);
        ArrayList<Integer>arr1=new ArrayList<>();
        arr1.add(3);
        arr1.add(4);
        A.add(arr1);
        rotate(A);

        for (int i = 0; i < A.size(); i++) {
            System.out.println(A.get(i));
        }

    }

    static void rotate(ArrayList<ArrayList<Integer>> A) {

        //Transpose

        int n = A.size();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = A.get(i).get(j);//[i][j]
                A.get(i).set(j, A.get(j).get(i));
                A.get(j).set(i, temp);
            }
        }
        //swap;

        for(int i=0;i<A.size();i++) {
            int start = 0;
            int end = A.size() - 1;
            while (start < end) {
                int temp = A.get(i).get(start);
                A.get(i).set(start, A.get(i).get(end));
                A.get(i).set(end, temp);
                start++;
                end--;
            }
        }
    }
}
