package Scalar;

public class maxOneWithOneSwap {
    public static void main(String[] args) {
        String A="11010110000000000";
        int totalOne=0;
        int n=A.length();
        for(int i=0;i<n;i++){
            if(A.charAt(i)=='1'){
                totalOne++;
            }
        }

        //find largerst subarray with only one zero;
        int maxCount=0;
        for(int i=0;i<n;i++){
            int count=0;
            int minZero=1;
            int j=i;
            while(minZero>-1 && j<n){
                if(A.charAt(j)=='1'){
                    count++;
                }
                else{
                    minZero--;
                }
                j++;
            }
            //
            maxCount=Math.max(maxCount,count);
        }

        if(maxCount==totalOne){
            //return maxCount;
        }
        //return maxCount+1;
    }
}
