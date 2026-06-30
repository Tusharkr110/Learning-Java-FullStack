package basics.Exceptions;

public class DemoExceptions {
    public static void main(String args[]) {
        int a =23;
//      Exception occured (Arithmetic Exception)
//        System.out.println(a/0);
//      This Line will not execute as because exception occured and terminated the porgram.

        try{
            int b = 23;
            System.out.println(b/1_0);
        } catch(Exception e){
            System.out.println("Exception Occured "+e);
        }


        Library lib =new Library();
        lib.borrowBook(1011);

        System.out.println("The Statement is Done");

    }
}
class Library{
    int availableBookCount = 50;
    public void borrowRequestedCount(int count){
        try{
            if (count > availableBookCount){
//                similar expanded version of throw
//                Exception e = new Exception("Not Enough books available");
//                throw e;
//                we are creating object of exception class to throw an error

                throw new Exception("Not enough books available to borrow.");

            }
        }catch(Exception e) {
            System.out.println("Exception Occured.");
        }finally {
            System.out.println("FINALLY BLOCK");
        }
    }
    public void borrowBook(int bookRequested){
        try {
            int [] books = {101,102,103};
            System.out.println("Book Requested : "+ books[bookRequested]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Occured! you requested a book that does not exist.");
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception Occur");

        }catch(Exception e){
            System.out.println("This is parent of all Exception class.");
        }finally {
            System.out.println("This statement will always execute irrespective of the exception occur or not.");
            System.out.println("Mainly finally block is used for resource management, eg: sc.close() etc...");
        }
    }


}