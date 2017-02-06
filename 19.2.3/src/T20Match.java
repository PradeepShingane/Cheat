  
public class T20Match extends Match {

	public T20Match(int currentScore,float currentOver,int target)
	{
		super();
	}
	
	public T20Match()
	{
		
	}
	public float calculateRunrate() {
		 float reqRunRate=((this.getTarget()-this.getCurrentScore())/(20-this.getCurrentOver()));
		return reqRunRate;
		}

		public int calculateBalls() {
			 int balls= (int) ((20-this.getCurrentOver())*6);
			return balls;
		}
	
}


