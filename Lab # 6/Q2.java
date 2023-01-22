import java.util.Scanner;

public class Q2 {
	public static void main(String[] args){
		Scanner s1=new Scanner(System.in);
		String name="Kevin";
		String rollno="21sw00";

		System.out.println("\nBefore Passing Runtime Arguments:");
		System.out.println("\nName: " + name);
		System.out.println("Roll No: " + rollno);

		System.out.println("\nEnter Runtime Arguments:");
		System.out.println("\nEnter Your Name:");
		name=s1.nextLine();
		System.out.println("Enter Your Roll No.:");
		rollno=s1.nextLine();

		System.out.println("\nAfter Passing Runtime Arguments:");
		System.out.println("\nName: " + name);
		System.out.println("Roll No: " + rollno);
	}
}
