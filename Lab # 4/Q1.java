import java.util.Scanner;
class Q1{
	public static void main(String[] args){
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char ch=S1.next().charAt(0); //for taking char input
		switch (ch){
			case 'A':
				System.out.println("Vowel");
				break;
			case 'a':
				System.out.println("Vowel");
				break;
			case 'E':
				System.out.println("Vowel");
				break;
			case 'e':
				System.out.println("Vowel");
				break;
			case 'I':
				System.out.println("Vowel");
				break;
			case 'i':
				System.out.println("Vowel");
				break;
			case 'O':
				System.out.println("Vowel");
				break;
			case 'o':
				System.out.println("Vowel");
				break;
			case 'U':
				System.out.println("Vowel");
				break;
			case 'u':
				System.out.println("Vowel");
				break;
			default:
				System.out.println("Consonant");
				break;
		}
	}
}