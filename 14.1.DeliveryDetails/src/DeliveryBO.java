
public class DeliveryBO {
	
	

	public void displayAllDeliveryDetails(Delivery[] deliveryList) {
		// TODO Auto-generated method stub
		System.out.println("Delivery Details");
		for(int i=0;i<deliveryList.length;i++)
		{
			System.out.println("Delivery--"+(i+1));
		System.out.println(deliveryList[i].toString());
	}
	}
}
