import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Q3{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		try{
			File F=new File("Qs3.txt");
			F.createNewFile();

			FileWriter FW=new FileWriter("Qs3.txt");

			System.out.println("Enter Name: ");
			String name=s.nextLine();

			System.out.println("Enter Roll NO.: ");
			String roll=s.nextLine();

			FW.write("Name: " + name + "\nROll No.: " + roll);
			FW.close();
		}
		catch(IOException e){
			System.out.println("Error Occured");
			e.printStackTrace();
		}
	}	
}