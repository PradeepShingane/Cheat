
public class SuiteACRoom extends HotelRoom{
private int ratePerSqFeet;

public SuiteACRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi)
{
	super();
}

public SuiteACRoom()
{
	
}
public int getNumberOfSqFeet() {
	if(super.hasWifi)
	return ratePerSqFeet+2;
	else
		return ratePerSqFeet;
}

public int getRatePerSqFeet() {
	return ratePerSqFeet;
}

public void setRatePerSqFeet(int ratePerSqFeet) {
	this.ratePerSqFeet = ratePerSqFeet;
}

}
