package NonStatic_;

public class NonStaticMember {
    //non static variable
    int num;

    //constructor
    NonStaticMember(){
        System.out.println("Called the constructor");
    }
    //non static block
    {
        System.out.println("Non static block called");
    }

    //main method
    public static void main(String[] args) {

        System.out.println("Main method executed");
        //creating an stance of an constructor // calling the constructor
        new NonStaticMember();
    }
}
//Main method executed
//Non static block called
//Called the constructor