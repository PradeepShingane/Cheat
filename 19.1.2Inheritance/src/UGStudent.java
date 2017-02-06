class UGStudent extends Student
{
	private String degree;
	private String stream;
	
	public UGStudent(String name,String id,int age,double grade,String address,String degree,String stream)
	{
		this.degree=degree;
		this.stream=stream;
		this.address=address;
		this.grade=grade;
		this.age=age;
		this.name=name;
		this.id=id;
	}
	public String getDegree() {
		return degree;
	}
	int flag=0;
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	
	public void display()
	{
		System.out.println("Name : "+this.getName()+"\nId : "+this.getId()+"\nAge : "+this.getAge()+"\nGrade : "+this.getGrade()+"\nAddress : "+this.getAddress()+"\nDegree : "+this.getDegree()+"\nStream : "+this.getStream());
	}
	
	public boolean isPassed()
	{
		if(this.getGrade()>70)
		{
			flag=1;
		}
		if(flag==1)
			return true;
		else
			return false;
}
}
