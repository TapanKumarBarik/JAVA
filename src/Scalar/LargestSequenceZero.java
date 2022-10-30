package Scalar;
import java.util.*;
public class LargestSequenceZero {
    public static void main(String[] args) {
    int[]arr={1, 2, -3, 3};
    lszero(arr);
    }
    static int[] lszero(int[] A) {

        int n=A.length;
        int[]pf=new int[n];
        pf[0]=A[0];
        int maxAns=0;

        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+A[i];
            if(pf[i]==0){
                maxAns=i;
            }
        }
        //
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();

        for(int i=0;i<n;i++){
            int num=pf[i];
            map.put(pf[i],i);
        }

        //
        int currStart=0;
        for(int i=0;i<n;i++){
            int dist=map.get(pf[i])-i;

            if(dist>maxAns){
                currStart=i;
                maxAns=dist;
            }
        }
        //
        int[]arr=new int[maxAns-currStart+1];

        for(int i=0;i<arr.length;i++){
            arr[i]=A[currStart+i];
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
