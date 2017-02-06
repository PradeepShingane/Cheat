import java.util.Arrays;


public class SortScore extends Thread {
String matchType,scoreString;
int[] scores;

public String getMatchType() {
	return matchType;
}


public int[] getScores() {
	return scores;
}


public SortScore(String matchType, String scoreString) {
	super();
	this.matchType = matchType;
	this.scoreString = scoreString;
}

public void run()
{
	int i=0;
	scores=new int[scoreString.split(",").length];
	for(String s:scoreString.split(","))
	{
		scores[i++]=Integer.parseInt(s);
	}
	Arrays.sort(scores);
}
}

