class EventBO {
	
	public Event createEvent(String data, Innings[] InningList)
	{

		 int l=InningList.length;
	       Innings[] t=new Innings[l];
	         String s[]=data.split(",");
	         String eventNumber;
	     	String raider;
	     	String teamOneScore;
	     	String teamTwoScore;
	     	Innings innings;
	     	eventNumber=s[0];
	     	raider=s[1];
	     	teamOneScore=s[3];
	     	teamTwoScore=s[4];
	         for(int i=0;i<l;i++)
	         {
	                if(InningList[i].getInnings().equals(s[3]))
	                {
	                       t.innings=InningList[i];
	                }
	                       
	         }
	         
	         Event m=new Event(s[0],s[1],s[2],s[3],t);
	         
	         return m;
		
	}
	
	

	public  Long findInningsNumber(Event[] eventList, long eventNumber) {
	
		
		
	}

}
