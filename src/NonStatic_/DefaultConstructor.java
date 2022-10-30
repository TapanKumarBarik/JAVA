package NonStatic_;

public class DefaultConstructor {
    //non static variable
    int num;

    //constructor
  
    //non static block
    {
        System.out.println("Calling non static block");
    }
    static {
        System.out.println("Calling the static block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        new DefaultConstructor();
        new DefaultConstructor();
        new DefaultConstructor();
        new DefaultConstructor();
        new DefaultConstructor();
        new DefaultConstructor();

    }

}
//Calling the static block
//Main method

//Calling non static block
//Calling non static block
//Calling non static block
//Calling non static block
//Calling non static block
//Calling non static block
