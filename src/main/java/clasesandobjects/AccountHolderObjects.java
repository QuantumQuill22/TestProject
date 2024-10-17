package clasesandobjects;

public class AccountHolderObjects 
{
   public static void main(String[] args) 
   {
	   AccountHolder tom = new AccountHolder();
	   AccountHolder henry = new AccountHolder();
	   AccountHolder sarahj = new AccountHolder();
	   
	   tom.Firstname="Tom";
	   tom.lastname="Smith";
	   tom.age=26;
	   tom.accountbalance=20000;
	   tom.testEligibilityForCreditCard();
       
	   System.out.println("IS Tom Eligible for CC : "+tom.eligibleForCreditCard);
   }

}
