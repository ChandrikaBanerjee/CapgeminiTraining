
public class BankTest {

	public static void main(String args[]) {
	BankFactory mmbankFactory=new MMBankFactory();
	
	
	MMSavingAccount savingaccount = (MMSavingAccount) mmbankFactory.getNewSavingAcc(100, "ABC", 50000.0f, true);
	System.out.println(savingaccount);
	savingaccount.withdraw(20000.0f);
	System.out.println(savingaccount);
	
	MMCurrentAccount currentaccount = (MMCurrentAccount) mmbankFactory.getNewCurrentAcc(200, "PQR", 20000.0f, 5000.0F);
	System.out.println(currentaccount);
	currentaccount.withdraw(50000.0f);
	System.out.println(currentaccount);
	
	}
}
