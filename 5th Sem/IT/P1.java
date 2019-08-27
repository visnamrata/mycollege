import java.util.*;

class BankAccount
{
	private int accountNo;
	private static int lastAccount = 0;
	private  float balance;

	BankAccount()
	{
		accountNo = lastAccount;
		balance = 0;
		lastAccount += 1;
	}

	BankAccount(float x)
	{
		accountNo = lastAccount;
		balance = x;
		lastAccount += 1;
	}

	void deposit(float x)
	{
		if(x>0)
			balance+= x;
		else
			System.out.println("Can't deposit a negative amount.");
	}

	void withdraw(float x)
	{
		if(balance>=x)
			balance-= x;
		else
			System.out.println("Can't withdraw amount greater than balance.");
	}

	int get_account_no()
	{
		 // System.out.println("My account No. is: " + accountNo);
		return accountNo;
	}

	float get_balance()
	{
		// System.out.println("My balance is: " + balance);
		return balance;	
	}

	void tax_deduction(float taxAmount)
	{
		balance-=taxAmount;
	}
}

class Bank extends BankAccount
{
	private ArrayList<BankAccount> account=new ArrayList<BankAccount>();

	void addAccount(BankAccount t)
	{
		account.add(t);
	}

	void BalanceInBank()
	{
		float balance2 = 0;
		for(int i=0; i<account.size(); i++)
		{
			BankAccount t = account.get(i);
			balance2 +=t.get_balance();
			// System.out.println("Account no:" + t.get_account_no());
		}
		System.out.println("Total bank balance is: " + balance2);
	}

	void maxAndMin()
	{
		BankAccount t1 = account.get(0);
		int max = t1.get_account_no(), min = t1.get_account_no();
		float minBal=t1.get_balance(), maxBal=t1.get_balance();

		for(int i=1; i<account.size(); i++)
		{
			BankAccount t = account.get(i);
			if(t.get_balance()<minBal)
			{
				minBal = t.get_balance();
				min = t.get_account_no();
				System.out.println("min: "+min);
			}
			if(t.get_balance()>maxBal)
			{
				maxBal = t.get_balance();
				max = t.get_account_no();
			}
		}
		System.out.println("Max Balance in Account: "+ max);
		System.out.println("Min Balance in Account: "+ min);

	}

	void search(int accNo)
	{
		int f=0;
		for(int i=0; i<account.size(); i++)
		{
			BankAccount t = account.get(i);
			if(t.get_account_no()==accNo)
			{
				f+=1;
				break;
			}
		}
		if(f>0)
			System.out.println("Account Found!!");
		else
			System.out.println("Account Not Found!!");
	}

	//'x' here is specific balance
	void count(float x)
	{
		int cnt=0;
		for(int i=0; i<account.size(); i++)
		{
			BankAccount t = account.get(i);
			if(t.get_balance()>x)
			{
				cnt+=1;
			}
		}
		System.out.println("Count of Account with minimum balance "+ x+ " are: " + cnt);
	}

}

class P1
{

	public static void main(String[] args) 
	{
		Bank tmp = new Bank();
		tmp.addAccount(new BankAccount(920));
		tmp.addAccount(new BankAccount(130));
		tmp.addAccount(new BankAccount(1290));
		tmp.addAccount(new BankAccount(510));
		tmp.BalanceInBank();
		tmp.maxAndMin();
		tmp.search(3);
		tmp.count(300);
	}
}