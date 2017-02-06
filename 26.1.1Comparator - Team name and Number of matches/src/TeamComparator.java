import java.util.Comparator;


public class TeamComparator implements Comparator<Team> {

	public int compare(Team t1, Team t2) {
		return (int) (t1.getNumberOfMatches()-t2.getNumberOfMatches());
		
	}

}
