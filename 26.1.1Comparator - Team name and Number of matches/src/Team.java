import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;


public  class Team implements Comparator<Team> {
String name;
long numberOfMatches;

	public Team(String name, long numberOfMatches) {
	super();
	this.name = name;
	this.numberOfMatches = numberOfMatches;
}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getNumberOfMatches() {
		return numberOfMatches;
	}


	public void setNumberOfMatches(long numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}


	

	@Override
	public String toString() {
		return  getName()+"-"+getNumberOfMatches();
	}


	public int compare(Team arg0, Team arg1) {
		// TODO Auto-generated method stub
		return 0;
	}


	public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
			Function<? super T, ? extends U> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	public static <T, U> Comparator<T> comparing(
			Function<? super T, ? extends U> arg0, Comparator<? super U> arg1) {
		// TODO Auto-generated method stub
		return null;
	}


	public static <T> Comparator<T> comparingDouble(
			ToDoubleFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	public static <T> Comparator<T> comparingLong(ToLongFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
		// TODO Auto-generated method stub
		return null;
	}


	public static <T> Comparator<T> nullsFirst(Comparator<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	public static <T> Comparator<T> nullsLast(Comparator<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
		// TODO Auto-generated method stub
		return null;
	}


	public Comparator<Team> reversed() {
		// TODO Auto-generated method stub
		return null;
	}


	public Comparator<Team> thenComparing(Comparator<? super Team> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	public <U extends Comparable<? super U>> Comparator<Team> thenComparing(
			Function<? super Team, ? extends U> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	public <U> Comparator<Team> thenComparing(
			Function<? super Team, ? extends U> arg0, Comparator<? super U> arg1) {
		// TODO Auto-generated method stub
		return null;
	}


	public Comparator<Team> thenComparingDouble(
			ToDoubleFunction<? super Team> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	public Comparator<Team> thenComparingInt(ToIntFunction<? super Team> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	public Comparator<Team> thenComparingLong(ToLongFunction<? super Team> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
