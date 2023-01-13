import java.util.Scanner;
class calculator {
	
	public float add ( float n1, float n2 ) {
		return ( n1 + n2 ) ;
	}

	public float sub ( float n1, float n2 ) {
		return ( n1 - n2 ) ;
	}

	public float mlt ( float n1, float n2 ) {
		return ( n1 * n2 ) ;
	}

	public float div ( float n1, float n2 ) {
		return ( n1 / n2 ) ;
	}
		
}

class Q1 { 
	public static void main ( String[] args ) {
		Scanner S1=new Scanner(System.in);
		char op;
		calculator c1=new calculator();

		System.out.println("Enter First Number: ");
		float f1=S1.nextFloat();

		System.out.println("Enter Second Number: ");
		float f2=S1.nextFloat();

		System.out.println("Enter Operator: ");
		char ch=S1.next().charAt(0);

		switch (ch){
			case '+':
				System.out.println("Result: " + c1.add(f1,f2));
				break;
			case '-':
				System.out.println("Result: " + c1.sub(f1,f2));
				break;
			case '*':
				System.out.println("Result: " + c1.mlt(f1,f2));
				break;
			case '/':
				System.out.println("Result: " + c1.div(f1,f2));
				break;
			default:
				System.out.println("Invalid Opeator");
				break;
		}
	}	
}