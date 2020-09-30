package RMMS;

public class DiscountMenu extends MenuItem {
	
	private String Remarks;
	private double Discount;
	
	//Default Constructor
	public DiscountMenu() {
		
	}
	
	//Parameterized Constructor
	public DiscountMenu(int itemNum, String itemName, String Description, String Remarks, double itemPrice, double Discount)
	{
		super(itemNum, itemName, Description, itemPrice);
		this.Remarks= Remarks;
		this.Discount= Discount;
	}
	
	//Setters
	public void setType(String Remarks) {
		this.Remarks= Remarks;
	}
	
	public void setDiscount(double Discount) {
		this.Discount= Discount;
	}
	
	//Getters
	public String getRemarks() {
		return Remarks;
	}
	
	public double getDiscount() {
		return Discount;
	}
	
	
	
	public String toString()
	{
		String Print= "\nDiscount Menu" + "\nItem Number: " + getitemNum() + "\nItem Name: " 
				+ getitemName() + "\nDescription: " + getDescription() + "\nRemarks: " +Remarks + "\nItem Price: $" +getitemPrice() +"\nDiscount :" +Discount +"%";
		
		return Print;
	}

}
