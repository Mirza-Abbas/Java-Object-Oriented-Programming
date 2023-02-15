interface Human{
	void display();
}

class Parent implements Human{  //keyword implements
	String Name="Parent";
	int Age;
	final String Gender="Male";  //keyword final
	private String Job;
	
	void setJob(String Job){
		this.Job=Job;  //keyword this
	}
	
	String getJob(){
		return Job;
	}

	public void display(){
		System.out.println("\nName: " + Name);
		System.out.println("Age: " + Age);
		System.out.println("Gender: " + Gender);
		System.out.println("Job: " + getJob());
	}
}

class Child extends Parent implements Human{  //keyword extends

	String FatherName=super.Name;  //Keyword super

	public void display(){
		System.out.println("\nName: " +  Name);
		System.out.println("Father's Name: " + FatherName);
		System.out.println("Age: " + Age);
		System.out.println("Gender: " + Gender);
	}
}

class Q3{
	public static void main(String[] args){

		Parent P1=new Parent();	
		P1.Age=80;
		P1.setJob("Software Engineer");
		P1.display();

		Child C1=new Child();
		C1.Name="Child";
		C1.Age=10;
		C1.display();
	}
}