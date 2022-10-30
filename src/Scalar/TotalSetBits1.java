package Scalar;

public class TotalSetBits1 {
    public static void main(String[] args) {

        int n=27;
        int count=0;
        for(int i=0;i<32;i++){

            count+=n&1;
            n=n>>1;
        }
        System.out.println(count);
    }
}
