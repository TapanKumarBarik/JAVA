package Scalar;

public class EvenOddLengthArr {
    public static void main(String[] args) {
        int[]arr={796,483,671,998,149,374,801,
                99,67,8,99,97,95,88,87,90,99,99,90,99,90};

        int n=arr.length;
        int flag=1;

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                int count=0;
                for(int j=i;j<n;j++){
                    count++;
                    if(arr[j]%2==0 && count%2==0){
                        System.out.println("yes");
                        flag=0;
                        break;
                    }
                }
                if(flag==0){
                    break;
                }
            }
        }
        if(flag==1){
            System.out.println("No");
        }
    }
}
