class student{
	String Name;
	String RollNo;
	String Dept;

	student(String n, String rn, String d){   //Constructor
		Name=n;
		RollNo=rn;
		Dept=d;
	}

	void set(String n, String rn, String d){
		Name=n;
		RollNo=rn;
		Dept=d;
	}

	String get(){
		return(Name+"\n"+RollNo+"\n"+Dept);
	}

}

class Q3{
	public static void main(String[] args){
		student s1=new student("Kevin", "001", "SW");
		System.out.println(s1.get());

	}
}