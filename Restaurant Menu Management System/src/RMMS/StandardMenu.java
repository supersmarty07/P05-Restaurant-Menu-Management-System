package RMMS;

public class StandardMenu extends MenuItem {

	private String Remarks;
	
	//Default Constructor
	public StandardMenu() {
		
	}
	
	//Parameterized Constructor
	public StandardMenu(int itemNum, String itemName, String Description, String Remarks, double itemPrice)
	{
		super(itemNum, itemName, Description, itemPrice);
		this.Remarks= Remarks;	
		
	}
	
	//Setters
	public void setRemarks(String Remarks) {
		this.Remarks= Remarks;
	}
	
	//Getters
	public String getRemarks() {
		return Remarks;
	}
	
	public String toString()
	{
		String Print= "\nStandard Menu" + "\nItem Number: " + getitemNum() + "\nItem Name: " 
	+ getitemName() + "\nDescription: " + getDescription() + "\nRemarks: " +Remarks + "\nItem Price: $" +getitemPrice() ;
	
		return Print;
	}
	
	
}

