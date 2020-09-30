package RMMS;
import java.util.ArrayList;


public class Menu {
	
	private String menuName;
	private String Time;
	private String Location;
	public ArrayList <MenuItem> List= new ArrayList<>();
	
	//Default constructor
	public Menu() {
		
	}
	
	//Parameterized constructor
	public Menu(String menuName, String Time, String Location)
{
	this.menuName= menuName;
	this.Time= Time;
	this.Location= Location;
}
	//Setters
	public void setmenuName(String menuName) {
		this.menuName= menuName;
	}
	
	public void setTime(String Time) {
		this.Time= Time;
	}
	
	public void setLocation(String Location) {
		this.Location= Location;
	}
	
	
	//Getters
	public String getmenuName() {
		return menuName;
	}
	
	public String getTime( ) {
		return Time;
	}
	
	public String getLocation() {
		return Location;
	}
	
	
	public String toString()
	{
		
		return "\nMenu Name : " + this.menuName +
				"\nTime   : " + this.Time +
				"\nLocation : " + this.Location;
	}
}


	
