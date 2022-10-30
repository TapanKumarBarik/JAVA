package NonStatic_;

public class ObjReference {
    int num;
    ObjReference(){

    }

    public static void main(String[] args) {
        ObjReference obj=new ObjReference();
        System.out.println(obj.num);//0
    }
}
