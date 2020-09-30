package RMMS;


public class DrinksMenu extends MenuItem{
	
	private String Remarks;
	
	//Default Constructor
	public DrinksMenu() {
		
	}
	
	//Parameterized Constructor
	public DrinksMenu(int itemNum, String itemName, String Description, String Remarks, double itemPrice)
	{
		super(itemNum, itemName, Description, itemPrice);
		this.Remarks= Remarks;
		
	}
	
	//Setters
	public void setType(String Remarks) {
		this.Remarks= Remarks;
	}
	
	//Getters
	public String getRemarks() {
		return Remarks;
	}
	
	public String toString() {
	
		String Print= "\nDrinks Menu" + "\nItem Number: " + getitemNum() + "\niIem Name: " 
				+ getitemName() + "\nDescription: " + getDescription() + "\nRemarks: " +Remarks + "\nItem Price: $" +getitemPrice() ;
		
		return Print;
	}

}
