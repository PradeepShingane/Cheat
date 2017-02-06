import java.util.HashMap;


public class Histogram {
private HashMap<Integer,Integer> bins;


public Histogram(HashMap<Integer, Integer> bins) {
	super();
	this.bins = bins;
}

public HashMap<Integer, Integer> getBins() {
	return bins;
}

public void setBins(HashMap<Integer, Integer> bins) {
	this.bins = bins;
}

public void addScore(int key)
{
	System.out.print(key+" : ");
}
public void displayHistogram(HashMap<Integer,Integer> bins)
{
	if(bins.containsValue(getBins()))
			{
			
	for(int i=0;i<bins.size();i++)
		  System.out.println("*");
	  }
	
}
}

