  
public class TestMatch extends Match {

	public TestMatch(int currentScore,float currentOver,int target)
	{
        super();
	}
public TestMatch()
{

}
public float calculateRunrate() {
	 float reqRunRate=((this.getTarget()-this.getCurrentScore())/(90-this.getCurrentOver()));
	return reqRunRate;
	}

	public int calculateBalls() {
		 int balls= (int) ((90-this.getCurrentOver())*6);
		return balls;
	}

}


