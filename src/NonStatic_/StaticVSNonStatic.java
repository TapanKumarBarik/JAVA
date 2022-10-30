package NonStatic_;

public class StaticVSNonStatic {

    //non static variable
    int num;

    //constructor
    StaticVSNonStatic(){
        System.out.println("Calling the constructor block");
    }
    //non static block
    {
        System.out.println("Calling non static block");
    }
    static {
        System.out.println("Calling the static block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        new StaticVSNonStatic();
        new StaticVSNonStatic();
        new StaticVSNonStatic();
        new StaticVSNonStatic();

    }

}
//Calling the static block
//Main method

//Calling non static block
//Calling the constructor block

//Calling non static block
//Calling the constructor block

//Calling non static block
//Calling the constructor block

//Calling non static block
//Calling the constructor block