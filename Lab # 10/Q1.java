import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Q1{
	public static void main(String[] args){
		try{
			File F=new File("Q1.json");
			F.createNewFile();

			FileWriter FW=new FileWriter("Q1.json");
			FW.write("My First File");
			FW.close();

			Scanner F1=new Scanner(F);
			String s=F1.nextLine();
			System.out.println(s);
			F1.close();
		}
		catch(IOException e){
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}