package RMMS;

public class Customer {

	private int CustomerID;
	private String CustomerName;
	private String CusStatus;
	private double Discount; 
	
	
	//Default Constructor
	public Customer() {
		
	}
	
	//Parameterized Constructor
	public Customer(int CustomerID, String CustomerName, String CusStatus, double Discount) {
		this.CustomerID= CustomerID;
		this.CustomerName= CustomerName;
		this.CusStatus= CusStatus;
		this.Discount= Discount;
	}
	
	
	//Setters
	public void setCustomerID(int CustomerID)
	{
		this.CustomerID = CustomerID; 
	}
	
	public void setCustomerName(String CustomerName)
	{
		this.CustomerName = CustomerName; 
	}
	
	public void setCusStatus(String CusStatus)
	{
		this.CusStatus = CusStatus; 
		setDiscount();
	}
	

	private void setDiscount()
	{
		if (CusStatus.equals("Active"))
			Discount = 0.05;
		else if (CusStatus.equals("VIP"))
			Discount = 0.1; 
		else
			Discount = 0; 
	}
	
	//Getters
	public double getDiscount()
	{
		return Discount; 
	}
	
	public String toString()
	{
		return "\nID: " + this.CustomerID +
				"\nNAME: " + this.CustomerName +
				"\nSTATUS: " + this.CusStatus + 
				"\nDISCOUNT: " + (this.Discount*100) + "%"; 
	}
}
