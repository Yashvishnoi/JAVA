
class LowBalanceException extends Exception
{
    LowBalanceException(String s){  
          super(s);  
         }  
    }

class Accounts
{
    int id;
    double balance;
    
    Accounts(String s)
    {
        if(s=="savings") 
        {
            id = 4242;
            balance = 3000.00;
        }
        else if(s=="current")
        {
            id=2290;
            balance = 10000.10;
        }
        else {
            id=11111;
            balance=1000.00;
        }
    }
    
    double withdraw(double amt) throws LowBalanceException
    {
        if(amt<=balance)
        {
            balance=balance-amt;
        }
        else 
        {
              throw new LowBalanceException("low balance"); 
        }
        return balance;
    }
    
    double deposit(double amt) 
    {
        balance = balance+amt;
        return balance;
    }
    
}

public class Bank_Managment_Exception {
    public static void main(String[] args) 
    {

        Accounts a1 = new Accounts("current");
        try 
        {
            System.out.println(a1.withdraw(11000));
        }
        catch (LowBalanceException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}