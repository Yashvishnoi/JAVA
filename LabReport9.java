class LowBalance extends Exception
{
   LowBalance(String s){ 
       super(s); 
      } 
   }


class Account {
	int AccId;
	double Balance;
	
	public Account(int AccId1 , double Balance1) {
		this.AccId=AccId1;
		this.Balance=Balance1;
	}
	
	double deposit(double amount) {
		Balance+=amount;
		return Balance;
	}
	
	double withdraw(double amount) throws LowBalance {
		if(amount<=Balance) {
			Balance-=amount;
		}
		else {
			throw new LowBalance("Insufficient Amount");
		}
		return Balance;
}
}
public class LabReport9 {

	public static void main(String[] args) {
		Account obj =new Account(11034,10000);
		try 
	      {
	         System.out.println(obj.withdraw(100));
	      }
	      catch (LowBalance e)
	      {
	         e.printStackTrace();
	      }
		
	}
}
