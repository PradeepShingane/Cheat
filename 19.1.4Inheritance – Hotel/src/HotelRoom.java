
public class HotelRoom {
protected String hotelName;
protected int numberOfSqFeet;
protected boolean hasTV,hasWifi;

public HotelRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi)
{
	this.hasTV=hasTV;
	this.hasWifi=hasWifi;
	this.hotelName=hotelName;
	this.numberOfSqFeet=numberOfSqFeet;
}
public HotelRoom()
{
	
}
public String getHotelName() {
	return hotelName;
}
public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}
public int getNumberOfSqFeet() {
	return numberOfSqFeet;
}
public void setNumberOfSqFeet(int numberOfSqFeet) {
	this.numberOfSqFeet = numberOfSqFeet;
}
public boolean isHasTV() {
	return hasTV;
}
public void setHasTV(boolean hasTV) {
	this.hasTV = hasTV;
}
public boolean isHasWifi() {
	return hasWifi;
}
public void setHasWifi(boolean hasWifi) {
	this.hasWifi = hasWifi;
}
public int calculateTariff()
{
	return numberOfSqFeet*getRatePerSqfeet();
	}

public int getRatePerSqfeet()
{
	return 0;
}

}
