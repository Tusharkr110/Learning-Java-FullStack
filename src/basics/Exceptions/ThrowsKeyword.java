package basics.Exceptions;

public class ThrowsKeyword {
//after throw keywords all the execution afterward are terminated.
    public static void main(String args[]) throws Exception
    {
        Throwsssss th = new Throwsssss();

        th.throwsKeyword();

        try {
            th.throwsKeyword();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Throwsssss{
    public void throwsKeyword() throws Exception{
        System.out.println("We use Throws keyword, when we know there is an exception, but does not want to handle this,so we use THROWS keyword beside method delcaration. eg:");
        System.out.println("This will not resolve the error but have the option to know that this exception exist");
        System.out.println("We have two options either to put them in TRY CATCH block or declare in signature with THROWS keyword");
        System.out.println("But the error still persists, when calling in main method it shows error by the compiler and asks us to either put signature or handle the exception. If we handle then NO ERROR in Terminal, if we DON'T then ERROR SHOWS in TERMINAL");
        int a =234;
//        System.out.println(a/0);
        try{
            System.out.println(a/0);
        }catch (ArithmeticException e){
            System.out.println(e);
//            System.out.println("Exception : "+e.getMessage());
//            e.printStackTrace();
        }

    }

}