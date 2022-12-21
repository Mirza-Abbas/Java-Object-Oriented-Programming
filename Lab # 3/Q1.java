import java.util.Scanner;
class Q1{
	public static void main(String[] a){
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter no of Odd & Even Digits to Display: ");
		int no=S1.nextInt();
		
		int even=0,odd=1;
		for(int x=0;x<no;x++){
			System.out.println("Even: " + even + " \tOdd: " + odd);
			even+=2;
			odd+=2;
		}
	}
}