package Scalar;

public class ReverseStrings {
    public static void main(String[] args) {
        String A="crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
        System.out.println(solve(A));
    }
    static String solve(String A) {
        A=A.trim();
        int n=A.length();
        String s="";
        for(int i=n-1;i>=0;i--){
            s+=A.charAt(i);
        }

        //reverse word by word
        String temp="";
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                ans+=reverse(temp);
                temp="";
            } if(s.charAt(i)==' '){
                ans+=reverse(temp);
                temp="";
                ans+=" ";
            }else{
                temp+=s.charAt(i);
            }

        }
        ans+=reverse(temp);
        return ans;


    }
    private static String reverse(String s){

        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
}
