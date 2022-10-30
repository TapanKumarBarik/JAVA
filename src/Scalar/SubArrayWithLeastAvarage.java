package Scalar;

public class SubArrayWithLeastAvarage {
    public static void main(String[] args) {
//    int[]A={18, 11, 16, 19, 11, 9, 8, 15, 3, 10, 9, 20, 1, 19};
//    int B=1;
        int[]A={15, 7, 11, 7, 9, 8, 18, 1, 16, 18, 6, 1, 1, 4, 18};
                int B=6;
        System.out.println(solve(A,B));
    }
    public static int solve(int[] A, int B) {
        int minSum=0;
        int currSum=0;
        int currAns=0;
        int ans=0;

        for(int i=0;i<B;i++){
            currSum+=A[i];
        }
        minSum=currSum;
        int n=A.length;
        int index=0;
        for(int i=B;i<n;i++){
            currSum-=A[i-B];
            currSum+=A[i];
            if(currSum<minSum){
                minSum=currSum;
                currAns=i-B+1;
            }
        }
        return currAns;
    }
}
