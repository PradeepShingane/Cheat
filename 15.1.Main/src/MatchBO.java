  import java.util.*;
class MatchBO {
    Outcome outcome=new Outcome();
    Match match=new Match();
    int flag=0;
      public void printAllMatchDetails(List<Match> MatchList)
      {
            System.out.println("Match Details");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %s\n","Date","Team1","Team2","Venue","Status","Winner");
          for(int i=0;i<MatchList.size();i++)
          {
            System.out.println(MatchList.get(i).toString());
          }
            
      }
      
      

      public void printMatchDetailsWithOutcomeStatus(List<Match> MatchList, String outcomeStatus) {
            
            System.out.println("Match Details");
            System.out.format("%-15s %-15s %-15s %-15s %-15s %s\n","Date","Team1","Team2","Venue","Status","Winner");
            for(int i=0;i<MatchList.size();i++){
                 if(MatchList.get(i).toString().contains(outcomeStatus))
                 {
                   System.out.println(MatchList.get(i).toString());
                   flag++;
                 }
                
              
                 }
            if(flag==0)
                   System.out.println("Status not found");
            
      }
      
      public void printMatchDetailsWithOutcomeWinnerTeam(List<Match> MatchList, String outcomeWinnerTeam)
      {System.out.println("Match Details");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %s\n","Date","Team1","Team2","Venue","Status","Winner");
                        for(int i=0;i<MatchList.size();i++){
          if(MatchList.get(i).getOutcome().toString().contains(outcomeWinnerTeam))
          {
            System.out.println(MatchList.get(i).toString());
            flag++;
          }
         
      }
                        if(flag==0)
                              System.out.println("Status not found");
      
      }
}



