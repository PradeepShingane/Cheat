  
public class ODIMatch extends Match{

	public ODIMatch(int currentScore,float currentOver,int target)
			{
		        super();
			}
	public ODIMatch()
	{
		
	}
	public float calculateRunrate() {
	 float reqRunRate=((this.getTarget()-this.getCurrentScore())/(50-this.getCurrentOver()));
	return reqRunRate;
	}

	public int calculateBalls() {
		 int balls= (int) ((50-this.getCurrentOver())*6);
		return balls;
	}
	
	public void display(double reqRunRate,int balls){	
		System.out.println("Requirements:");
		System.out.println("Need " +(this.getTarget()- this.getCurrentScore())+(balls > 1 ? " Runs" : " Run" )+" in "+balls+(balls > 1 ? " balls" : " ball" ));		
		System.out.printf("Required Run Rate - %.2f\n",reqRunRate);
	}

}


