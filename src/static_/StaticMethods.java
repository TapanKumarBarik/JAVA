package static_;

public class StaticMethods {
    public static void main(String[] args) {
        System.out.println("Main method");
    }
    static  void method1(){
        System.out.println("I am static method 1");
    }

    //static block
    static {
        StaticMethods.method1();
    }
}
//I am static method 1
//Main method