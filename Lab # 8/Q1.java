import java.lang.Exception;
import java.util.Scanner;

class Q1{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		float n1,n2;
		try{
			System.out.println("Enter a Number: ");
			n1=s.nextFloat();
			System.out.println("Enter another number to divide: ");
			n2=s.nextFloat();
			if(n1==0 || n2==0){
				throw new Exception();
			}
			else{
				System.out.println("Result: " + n1/n2);
			}
		}
		catch(Exception e){
			System.out.println("Exception Occured: Arithmatic Exception \nPlease Provide Non-Zero Numbers");
		}
	}
}