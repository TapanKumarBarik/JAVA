package static_;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method is executed");
    }

    static {
        System.out.println("Executing static block 1 ");
    }

    static {
        System.out.println("Executing static block 2 ");
    }
}
/*
       Executing static block 1
        Executing static block 2
        Main method is executed
 */