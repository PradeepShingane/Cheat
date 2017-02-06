class Event {
	private
	Long eventNumber;
	String raider;
	long teamOneScore;
	long teamTwoScore;
	Innings innings;
	public Event(Long eventNumber, String raider, long teamOneScore,
			long teamTwoScore, Innings innings) {
	
		this.eventNumber = eventNumber;
		this.raider = raider;
		this.teamOneScore = teamOneScore;
		this.teamTwoScore = teamTwoScore;
		this.innings = innings;
	}
	
	public Long getEventNumber() {
		return eventNumber;
	}
	public void setEventNumber(Long eventNumber) {
		this.eventNumber = eventNumber;
	}
	public String getRaider() {
		return raider;
	}
	public void setRaider(String raider) {
		this.raider = raider;
	}
	public long getTeamOneScore() {
		return teamOneScore;
	}
	public void setTeamOneScore(long teamOneScore) {
		this.teamOneScore = teamOneScore;
	}
	public long getTeamTwoScore() {
		return teamTwoScore;
	}
	public void setTeamTwoScore(long teamTwoScore) {
		this.teamTwoScore = teamTwoScore;
	}
	public Innings getInnings() {
		return innings;
	}
	public void setInnings(Innings innings) {
		this.innings = innings;
	}
	
	

}
