class ExtraType
{
   private Long eventNo;
   private String eType;
   private Long points;
   private String scoringTeam;


  ExtraType() {}
  ExtraType(Long eventNo,String eType,Long points,String scoringTeam)
   {
    this.eventNo=eventNo;
    this.eType=eType;
    this.points=points;
    this.scoringTeam=scoringTeam;
   }
 void setEventNo(Long eventNo)
   {
      this.eventNo=eventNo;
   }

   Long getEventNo()
   {
    return eventNo;
   }

   void setExtraType(String eType)
   {
    this.eType=eType;
   }

   String getExtraType()
   {
    return eType;
   }

   void setPoints(Long points)
   {
      this.points=points;
   }

   Long getPoints()
   {
    return points;
   }
   
    void setScoringTeam(String scoringTeam)
   {
    this.scoringTeam=scoringTeam;
   }

   String getScoringTeam()
   {
    return scoringTeam;
   }
  public String toString()
  {
  return String.format("EventNo : %s\nExtra Type : %s\nPoints Scored : %s\nScoring Team : %s",eventNo,eType,points,scoringTeam);
  }

}
