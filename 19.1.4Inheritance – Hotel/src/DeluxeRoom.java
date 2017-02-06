
public class DeluxeRoom extends HotelRoom{
protected int  ratePerSqFeet;

public DeluxeRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi)
{
	 ratePerSqFeet=10;
}
public DeluxeRoom()
{
	
}
public int getRatePerSqFeet() {
	if(super.hasWifi)
	return ratePerSqFeet+2;
	else
		return ratePerSqFeet;
}

public void setRatePerSqFeet(int ratePerSqFeet) {
	this.ratePerSqFeet = ratePerSqFeet;
}


}
