package Scalar;

public class NDividBy3 {
    public static void main(String[] args) {
        int []a={1, 1, 1, 2, 3, 5, 7};
        System.out.println(repeatedNumber(a));
    }
    public static int repeatedNumber(int[] A) {

        int num1=0;
        int num2=0;
        int vote1=0;
        int vote2=0;
        int n=A.length;
        int i=0;

        while(i<n){

            if(num1==A[i]|| num2==A[i]){
                if(num1==A[i]){
                    vote1++;
                }
                else{
                    vote2++;
                }
            }
            //First check
            else if(vote1==0 || vote2==0){
                if(vote1==0){
                    num1=A[i];
                    vote1++;
                }
                else{
                    num2=A[i];
                    vote2++;
                }
            }
            //second check


            //last
            else{
                vote1--;
                vote2--;
            }
            i++;
        }
        System.out.println(num1);
        System.out.println(num2);
        int count1=0;
        int count2=0;

        for(i=0;i<n;i++){

            if(A[i]==num1){
                count1++;
            }
            else if (A[i]==num2){
                count2++;
            }
        }

        //

        if(count1>n/3){
            return num1;
        }
        if(count2>n/3){
            return num2;
        }

        return -1;
    }
}
