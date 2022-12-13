class Q2{
	public static void main(String[] args){

		float Radius=5.6f, Circumference, Diameter, Area;

		Diameter=(float) (2f * Radius);

		Circumference=(float) (3.14 * Diameter);

		Area=(float) (3.14 * (Radius * Radius) );

		System.out.println("Radius of Circle: " + Radius);

		System.out.println("Diameter of Circle: " + Diameter);

		System.out.println("Circumference of Circle: " + Circumference);

		System.out.println("Area of Circle: " + Area);
	}
}