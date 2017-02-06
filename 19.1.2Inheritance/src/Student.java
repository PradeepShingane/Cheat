class Student
{
	protected String name;
	protected String id;
	protected int age;
	protected double grade;
	protected String address;
	
	Student(String name,String id,int age,double grade,String address)
	{
		this.name=name;
		this.address=address;
		this.age=age;
		this.grade=grade;
		this.id=id;
	}
	Student()
	{
		
	}
	int flag=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void display()
	{
		System.out.println("Name : "+this.getName()+"\nId : "+this.getId()+"\nAge : "+this.getAge()+"\nGrade : "+this.getGrade()+"\nAddress : "+this.getAddress());
	}
	
	public boolean isPassed()
	{
		if(this.getGrade()>50)
		{
			return true;
		}
		else
			return false;
}
}
	
