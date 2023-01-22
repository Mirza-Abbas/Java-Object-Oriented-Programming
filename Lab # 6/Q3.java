import java.util.Scanner;;

public class Q3 {
	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		float[] f=new float[5];
		float sum=0;
		for(int i=0;i<5;i++){
			System.out.println("Enter Float Number " + (i+1) + ". : ");
			f[i]=s1.nextFloat();
			sum+=f[i];
		}
		
		System.out.println("\nSum: " + sum);
		System.out.println("Average: " + sum/5);
	}
}
