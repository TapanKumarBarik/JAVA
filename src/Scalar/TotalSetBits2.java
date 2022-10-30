package Scalar;

public class TotalSetBits2 {
    public static void main(String[] args) {

        int n=27;
        int count=0;
        while(n!=0){
            count+=n&1;
            n=n>>1;
        }
        System.out.println(count);
    }
}
