class example{
	String ObjName;
	static int ObjNo=0;
	
	example(){    //constructor
		ObjNo++;
	}

	example(String n){ 	//constructor
		ObjName=n;
		ObjNo++;
	}

	void setName(String n){		//Mutator
		ObjName=n;	
	}

	String getName(){	//Accessor
		return ObjName;
	}

	int getNo(){		//Accessor
		return ObjNo;
	}
}

class Q2{
	public static void main(String[] args){
		example ex1=new example();
		ex1.setName("TV");
		System.out.println("Object No: " + ex1.getNo());
		System.out.println("Object Name: " + ex1.getName());


		example ex2=new example("Car");
		
		System.out.println("\nObject No: " + ex2.getNo());
		System.out.println("Object Name: " + ex2.getName());


	}
}