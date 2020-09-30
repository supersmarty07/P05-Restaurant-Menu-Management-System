package RMMS;

public class MenuItem {
	
	private int itemNum;
	private String itemName;
	private String Description;
	private double itemPrice;
	
	//Default constructor
	public MenuItem() {
		
	}

	//Parameterized Constructor
	public MenuItem(int itemNum, String itemName, String Description, double itemPrice)
	{
		this.itemNum= itemNum;
		this.itemName= itemName;
		this.Description= Description;
		this.itemPrice= itemPrice;
		
	}
	
	//Setters
	public void setitemNum(int itemNum) {
		this.itemNum= itemNum;
	}
	
	public void setitemName(String itemName) {
		this.itemName= itemName;
	}
	
	public void setDescription(String Description) {
		this.Description= Description;
	}
	
	public void setitemPrice(double itemPrice) {
		this.itemPrice= itemPrice;
	}
	
	//Getters
	public int getitemNum()
	{
		return itemNum;
	}
	
	public String getitemName()
	{
		return itemName;
	}
	
	public String getDescription()
	{
		return Description;
	}
	
	public double getitemPrice()
	{
		return itemPrice;
	}
	
	
	public String toString()
	{
		return itemNum+"\n"+itemName+"\n"+Description+"\n"+itemPrice;
	}
	
}

