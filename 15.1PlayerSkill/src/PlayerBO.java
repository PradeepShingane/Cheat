

class PlayerBO
{

 
  void viewDetails(Player[] playerList)
  { 
	  for(int i=0;i<playerList.length;i++)
	  {	  
		  System.out.println(playerList[i].toString());
	  }
   }
  void printPlayerDetailsWithSkill(Player[] playerList, String skillName)
  {
	  for(int i=0;i<playerList.length;i++)
	  {	  
		  if(playerList[i].getSkill().getSkillName().equals(skillName))
		  {
			  System.out.println(playerList[i].toString());
		  }
	  }

  }

} 
