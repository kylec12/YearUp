
public class Account 
{
	private int m_accountId = -1;
	private String m_accountName;
	private int m_customerId = -1;
	private double m_amount = 0.0;

	public Account(int accountId, String accountName, int customerId)
	{
		SetAccountId(accountId);
		SetAccountName(accountName);
	    SetCustomerId(customerId);
	}

	public int GetAccountId()
	{
		return m_accountId;
	}
	
	private void SetAccountId(int accountId) 
	{
		m_accountId = accountId; 
		
	}

	private void SetAccountName(String accountName)
	{
		m_accountName = accountName;
	}

	public String GetAccountName()
	{
		return m_accountName;
	}
	
	public int GetCustomerId()
	{
		return m_customerId;
	}

	private void SetCustomerId(int customerId)
	{
		m_customerId = customerId;
	}
	
	public double GetAmount()
	{
		return m_amount;
	}
	
	public void SetAmount(double amount)
	{
		m_amount = amount;
	}
	
	private void UpdateAmount (double newAmount)
	{
		m_amount = newAmount;
	}
	
	public void UpdateAmountSecurely (double newAmount, String password)
	{
		if (password != null)
		{
			if (password.equals("admin"))
			{
				UpdateAmount(newAmount);
				System.out.println ("Update amount in account id" + m_accountId + "to" + m_amount);
			}
			else
			{
				System.out.println("call the police! Unsecure access!!");
			
			}
			}
		}
	}

