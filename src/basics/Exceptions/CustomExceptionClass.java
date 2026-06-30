package basics.Exceptions;


import java.util.Scanner;

public class CustomExceptionClass {

    public static void main(String args[]) throws Exception {

        Bank balance = new Bank();
        Scanner sc = new Scanner(System.in);
        try{
            balance.checkBalance("John",-2432); //negative exception
            balance.checkBalance("Tushar",111112432); //maximum exception
            balance.checkBalance(null,231); //member exception
        }catch(Exception e){
            e.printStackTrace();//this line gives you the error with the stack track in terminal with red and blue line(link)
            System.out.println("Exception Occured: "+e.getMessage());
        }
        finally {
            sc.close();
        }
    }

}

class Bank{
//    int account_no;
    int balance =0;

    public void checkBalance(String memberName,int currentBalance) throws Exception{


        if (memberName == null || memberName.isEmpty()){
            throw new InvalidMemberException("Invalid Membership");
        }
        if (currentBalance< balance){
            System.out.println("Your Balance is "+ currentBalance);
                throw new NegativeBankBalanceException("Your Account have Negative Balance, We recommend you to Visit Your nearest Branch ASAP.");
        }
        if(currentBalance> 10000){
            System.out.println("Your Balance is "+ currentBalance);
            throw new MaximumBankBalanceException("You have crossed maximum bank balance exception.");

        }
    }


}

class NegativeBankBalanceException
        extends Exception{
    public NegativeBankBalanceException(String message){
        super(message);
//        super(member);
    }
}
class MaximumBankBalanceException
        extends Exception{
    public MaximumBankBalanceException(String message){
        super(message);
    }
}

class InvalidMemberException extends Exception{
    public InvalidMemberException(String message){
        super(message);
    }

}