interface Vehicle{
	public void accelerate();
	public void decelerate();
	public void display();
}

interface Bus extends Vehicle{
	String BusName="SchoolBus";	
}

interface Truck extends Vehicle{
	String TruckName="VigoTruck";	
}

interface Car extends Vehicle{
	String CarName="HondaCar";	
}

class SchoolBus implements Bus{

	private String Color;
	private String Weight;
	private String Model;

	SchoolBus(String C, String W, String M){
		setColor(C);
		setWeight(W);
		setModel(M);
	}

	public void accelerate(){
		System.out.println("Bus Speed Accelerated");
	};
	public void decelerate(){
		System.out.println("Bus Speed Decelerated");
	};	

	public void display(){
		System.out.println("Color: " + getColor());
		System.out.println("Weight: " + getWeight());
		System.out.println("Model: " + getModel());
	}

	void setColor(String c){
		Color=c;
	};
	String getColor(){
		return Color;
	};
	void setWeight(String w){
		Weight=w;
	};
	String getWeight(){
		return Weight;
	};
	void setModel(String m){
		Model=m;
	};
	String getModel(){
		return Model;
	};
}

class HondaCar implements Car{

	private String Color;
	private String Weight;
	private String Model;

	HondaCar(String C, String W, String M){
		setColor(C);
		setWeight(W);
		setModel(M);
	}

	public void accelerate(){
		System.out.println("Car Speed Accelerated");
	};
	public void decelerate(){
		System.out.println("Car Speed Decelerated");
	};

	public void display(){
		System.out.println("Color: " + getColor());
		System.out.println("Weight: " + getWeight());
		System.out.println("Model: " + getModel());
	}

	void setColor(String c){
		Color=c;
	};
	String getColor(){
		return Color;
	};
	void setWeight(String w){
		Weight=w;
	};
	String getWeight(){
		return Weight;
	};
	void setModel(String m){
		Model=m;
	};
	String getModel(){
		return Model;
	};
}

class VigoTruck implements Truck{

	private String Color;
	private String Weight;
	private String Model;

	VigoTruck(String C, String W, String M){
		setColor(C);
		setWeight(W);
		setModel(M);
	}

	public void accelerate(){
		System.out.println("Truck Speed Accelerated");
	};
	public void decelerate(){
		System.out.println("Truck Speed Decelerated");
	};

	public void display(){
		System.out.println("Color: " + getColor());
		System.out.println("Weight: " + getWeight());
		System.out.println("Model: " + getModel());
	}

	void setColor(String c){
		Color=c;
	};
	String getColor(){
		return Color;
	};
	void setWeight(String w){
		Weight=w;
	};
	String getWeight(){
		return Weight;
	};
	void setModel(String m){
		Model=m;
	};
	String getModel(){
		return Model;
	};
}

class Q1{
	public static void main(String[] args){
		SchoolBus Bus1=new SchoolBus("Yellow","10,000 Kg","2022");
		HondaCar Car1=new HondaCar("White","7000 Kg","2022");
		VigoTruck Truck1=new VigoTruck("Black","16,000 Kg","2022");

		System.out.println("\nSchool Bus:");
		Bus1.display();
		Bus1.accelerate();

		System.out.println("\nHonda Car:");
		Car1.display();
		Car1.accelerate();

		System.out.println("\nVigo Truck:");
		Truck1.display();
		Truck1.accelerate();
	}
}
