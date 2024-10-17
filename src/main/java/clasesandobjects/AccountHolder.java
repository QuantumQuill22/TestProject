package clasesandobjects;

public class AccountHolder 
{
	String Firstname;
	String lastname;
	int age;
	float accountbalance;
	boolean eligibleForCreditCard;
	
	public void testEligibilityForCreditCard() 
	{
		if (age>25 && accountbalance>=20000){
			eligibleForCreditCard=true;
		}
	}
}
