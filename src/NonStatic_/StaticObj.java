package NonStatic_;

public class StaticObj {
    static{
        StaticObj st=new StaticObj();
        System.out.println(st);//NonStatic_.StaticObj@e9e54c2
    }

    public static void main(String[] args) {
        System.out.println("main");
    }
}
