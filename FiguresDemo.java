import java.util.Scanner;
import java.lang.Math;

abstract class Figures{
	double R, A, V;

	Figures(double r1){
		R=r1;
	}
	
	void Display_Area(){
	}

	void Display_Volume(){
	}
}

class Cone extends Figures{
	double H, S;
	
	Cone(double r1,double h1, double s1){
		super(r1);
		H=h1;
		S=s1;
	}
	void Calculate_Area(){
		super.A=(Math.PI*R*S)+(Math.PI*R*R);
	}
	void Calculate_Volume(){
		super.V=((Math.PI*R*R*H)/3);
	}
	void Display_Area(){
		System.out.println("Area: " + String.format("%.2f", super.A));
	}

	void Display_Volume(){
		System.out.println("Volume: " + String.format("%.2f", super.V));
	}
}

class FiguresDemo{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius:");
		double r=s.nextDouble();
		System.out.println("Enter height:");
		double h=s.nextDouble();
		System.out.println("Enter surface area:");
		double a=s.nextDouble();
		Cone c=new Cone(r,h,a);
		c.Calculate_Area();
		c.Calculate_Volume();
		c.Display_Area();
		c.Display_Volume();
	}
}
