
public class Delivery {
	long	over;
	long	ball;
	String	batsman;
	String	bowler;
	String	nonStriker;
	public long getOver() {
		return over;
	}
	public void setOver(long over) {
		this.over = over;
	}
	public long getBall() {
		return ball;
	}
	public void setBall(long ball) {
		this.ball = ball;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getNonStriker() {
		return nonStriker;
	}
	public void setNonStriker(String nonStriker) {
		this.nonStriker = nonStriker;
	}
	Delivery (long	over2,
			long	ball2,
			String	batsman,
			String	bowler,
			String	nonStriker)
			{
		this.over=over2;
		this.ball=ball2;
		this.batsman=batsman;
		this.bowler=bowler;
		this.nonStriker=nonStriker;
			}
	Delivery()
	{
		
	}
	public String toString() {
		return "Over :"+over+"\nBall :"+ball+"\nBatsman :"
				+batsman+"\nBowler :"+bowler+"\nNonStriker :"+nonStriker;
	}
	
}
