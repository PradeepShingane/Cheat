public class Revenue implements Comparable<Revenue>{
       
       String revenueCategory;
       int amount;
       public String getRevenueCategory() {
              return revenueCategory;
       }
       public void setRevenueCategory(String revenueCategory) {
              this.revenueCategory = revenueCategory;
       }
       public int getAmount() {
              return amount;
       }
       public void setAmount(int amount) {
              this.amount = amount;
       }
       public Revenue(String revenueCategory, int amount) {
              super();
              this.revenueCategory = revenueCategory;
              this.amount = amount;
       }
       public Revenue()
       {
              
       }
       public int compareTo(Revenue r)
       {
       if(this.amount>r.amount)
       {
              return -1;
       }
       else
       {
              return 1;
       }
       }  
       public void display1()
       {
              //System.out.println(String.format("%-15s%-15s","Category", "Amount"));
              System.out.println(String.format("%-15s%-15s",revenueCategory,amount));
       }
       
       public void display2(int sum)
       {
    	  float contribution = (amount/(float)sum)*100; 
    	   System.out.println(String.format("%-15s%-15.2f",revenueCategory,contribution));
       }
     
      
}
