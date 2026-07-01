package basics.Interface;

public class interfaceCallingSuperMethod {
    public static void main(String[] args) {
        D d = new D();
        d.fun();
    }
}

interface A{
    void fun();
}


interface B extends A{
    default void fun(){
        System.out.println("Inside Interface B");
    }
}

interface C extends A{
    default void fun(){
        System.out.println("Inside Interface C");
    }
}

class D implements B, C{
    @Override
    public void fun(){
         System.out.println("Inside D");
        // B.super.fun();
        // C.super.fun();
//        super.fun();
    }


}