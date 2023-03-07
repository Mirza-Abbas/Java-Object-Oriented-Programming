import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class Q2{
	public static void main(String[] args){
		try{
			File F=new File("Qs2.txt");
			F.createNewFile();
		
			FileWriter FW = new FileWriter("Qs2.txt");  
    			BufferedWriter BW = new BufferedWriter(FW);  
    			BW.write("My Java File");  
    			BW.close();  
	
				FileReader FR=new FileReader("Qs2.txt");    
			BufferedReader BR=new BufferedReader(FR);      
			String line;
          		while((line=BR.readLine())!=null){  
          			System.out.print(line);  
          		}  
          		BR.close();  
			FR.close();  
		}	
		catch(Exception e){
			e.printStackTrace();
		}
	}
}