class InsufficientFundsException extends Exception{

    public InsufficientFundsException(String message){
        super(message);
    }
}

class Banking{
     private double balance;

     public Banking(double balance){
         this.balance = balance;
     }

     public void withdraw(double amt) throws InsufficientFundsException{
         if(amt > balance){

             throw new InsufficientFundsException("Balance too less......");

         }
         balance -= amt;
         System.out.println("balance is ......"+ amt);
     }
}

public class BankDemo {

    public static void  main(String[] args){

        Banking bb = new Banking(2000);

        try {
            bb.withdraw(4000);
        }
        catch (InsufficientFundsException i){

            System.out.println(i);
        }
    }
}
