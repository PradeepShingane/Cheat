  public class PlayerBO {
    public Player createPlayer(String data, Team[] teamList)
	{
    	
	  String[] a=data.split(",");
	  Team t=null;
	 
	 for(int i=0;i<teamList.length;i++)
	 {
		 if(teamList[i].getName().equals(a[1]))
		 {
			 t=teamList[i];
		 }
	 }
	 Player p=new Player(a[0],t);
	return p;
	}
	  
	
	public String findTeamName(Player[] playerList, String playername)
	{
		String a=null;
		 for(int i=0;i<playerList.length;i++)
		 {
			 if(playerList[i].getName().equals(playername))
			 {
				 Team b=playerList[i].getTeam(); 
			   a=playername+" belongs to "+b;
			 }
				 
		 }
		 return a;
			 
	}
	
	public boolean findWhetherPlayersAreInSameTeam (Player[] playerList, String playername1, String playername2)
	{
		int flag1=1,flag2=1;
		for(int i=0;i<playerList.length;i++)
		{
			
			if(playerList[i].getName().equals(playername1))
			{
				flag1=0;
			}
			if(playerList[i].getName().equals(playername2))
			{
				flag2=0;
			}
		}
		if(flag1==0 && flag2==0)
		return true;
		else
			return false;
	}

}




