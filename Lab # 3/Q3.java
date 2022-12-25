import java.util.Scanner;

class Q3{
	public static void main(String[] args){

		Scanner S1= new Scanner(System.in);

		System.out.println("Enter Starting Point: ");

		int start= S1.nextInt();

		System.out.println("Enter Ending Point: ");

		int end= S1.nextInt();

		System.out.println("Enter Table No: ");

		int table= S1.nextInt();

		for(int x=start;x<=end;x++){
			System.out.println( table + " * " + x + " = " + (table*x));
		}
	}
		
}