
public class InternationalPlayer extends Player{
	private String capNumber;
	private long noOfTestAppearance;
	private long noOfODIAppearance;
	
	public InternationalPlayer(String name, String country, String capNumber,
			long noOfTestAppearance, long noOfODIAppearance) {
		super(name, country);
		this.capNumber = capNumber;
		this.noOfTestAppearance = noOfTestAppearance;
		this.noOfODIAppearance = noOfODIAppearance;
	}

	public InternationalPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InternationalPlayer(String name, String country) {
		super(name, country);
		// TODO Auto-generated constructor stub
	}

	public void displayDetails(){
		System.out.println("Player Details:");
		System.out.println("Player name : "+getName());
		System.out.println("Country : "+getCountry()+"\nCap number : "+this.capNumber);
		System.out.println("Number of test appearnace : "+this.noOfTestAppearance);
		System.out.println("Number of ODI appearnace : "+this.noOfODIAppearance);
	}
	
}
