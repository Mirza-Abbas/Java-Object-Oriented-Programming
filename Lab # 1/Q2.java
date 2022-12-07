class Q2{
	public static void main(String[] args){

		double No=50.25;

		int IntNo=(int) No; 

		double FracNo=(No-IntNo);
		
		System.out.println("Actual Number: " + No);

		System.out.println("Integral Part: " + IntNo);

		System.out.println("Fractional Part: " + FracNo);
	}
}