import java.util.Scanner;
class Q2{
	public static void main(String[] args){
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		float n1=S1.nextFloat();
		System.out.println("Enter 2nd Number: ");
		float n2=S1.nextFloat();
		System.out.println("Enter Operator (+,-,*,/) : ");
		char op=S1.next().charAt(0); 			//for taking char input
		float res;
		switch (op){
			case '+':
				res=n1+n2;
				System.out.println("Result:" + res);
				break;
			case '-':
				res=n1-n2;
				System.out.println("Result:" + res);
				break;
			case '*':
				res=n1*n2;
				System.out.println("Result:" + res);
				break;
			case '/':
				res=n1/n2;
				System.out.println("Result:" + res);
				break;
			default:
				System.out.println("Invalid Operator");
				break;
		}
	}
}