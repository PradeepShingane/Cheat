class PGStudent extends Student
{
	private String specialization;
	private int noOfPapersPublished;
	
	PGStudent(String name,String id,int  age,double grade,String address,String specialization,int noOfPapersPublished){
		this.specialization=specialization;
		this.noOfPapersPublished=noOfPapersPublished;
		this.address=address;
		this.age=age;
		this.grade=grade;
		this.name=name;
		this.id=id;
	}
	int flag=0;
	PGStudent()
	{
		
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getNoOfPapersPublished() {
		return noOfPapersPublished;
	}
	public void setNoOfPapersPublished(int noOfPapersPublished) {
		this.noOfPapersPublished = noOfPapersPublished;
	}
	public void display()
	{
		System.out.println("Name : "+this.getName()+"\nId : "+this.getId()+"\nAge : "+this.getAge()+"\nGrade : "+this.getGrade()+"\nAddress : "+this.getAddress()+"\nSpecialization : "+this.getSpecialization()+"\nNo. of papers published : "+this.getNoOfPapersPublished());
	}
	
	public boolean isPassed()
	{
		if(this.getGrade()>70 && this.noOfPapersPublished>=2)
		{
			flag=1;
		}
		if(flag==1)
			return true;
		else
			return false;
}
}
