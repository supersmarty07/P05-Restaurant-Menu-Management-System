package RMMS;

public class PremiumMenu extends MenuItem {

	private String Remarks;
	private double Surcharge;
	
	//Default Constructor
	public PremiumMenu() {
		
	}
	
	//Parameterized Constructor
	public PremiumMenu (int itemNum, String itemName, String Description, String Remarks, double itemPrice, double Surcharge)
	{
		super(itemNum, itemName, Description, itemPrice);
		this.Remarks= Remarks;
		this.Surcharge= Surcharge;
		
	}
	
	//Setters
	public void setRemarks(String Remarks) {
		this.Remarks= Remarks;
	}
	
	public void setSurcharge(double Surcharge) {
		this.Surcharge= Surcharge;
	}
	
	//Getters
	public String getRemarks() {
		return Remarks;
	}
	
	public double getSurcharge() {
		return Surcharge;
	}
	
	
	public String toString()
	{
		String Print= "\nPremium Menu" + "\nItem Number: " + getitemNum() + "\nItem Name: " 
				+ getitemName() + "\nDescription: " + getDescription() + "\nRemarks: " +Remarks+ "\nItem Price: $" +getitemPrice() +"\nSurcharge:" +Surcharge +"%";
		
		return Print;
	}
}
