
public class DeluxeACRoom extends DeluxeRoom{
int ratePerSqFeet;
public DeluxeACRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi)
{
	ratePerSqFeet=12;
}

public int getRatePerSqFeet() {
	if(super.hasWifi)
	return ratePerSqFeet+2;
	else
		return ratePerSqFeet;
}
}
