public abstract class Match {
	private int currentScore;
	private float currentOver;
	private int target;
	
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public float getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(float currentOver) {
		this.currentOver = currentOver;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	public abstract float calculateRunrate();
	
	public abstract int calculateBalls();
	
	public void display(float reqRunRate,int balls){	
		/* System.out.println("Requirements:");
		System.out.println("Need " +(target - currentScore)+(balls > 1 ? " Runs" : " Run" )+" in "+balls+(balls > 1 ? " balls" : " ball" ));		
		System.out.printf("Required Run Rate - %.2f\n",reqRunRate);   */
	}

}


