import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		char[] chararr={'a','b','c','d','e'};
        
		System.out.println("Enter a character to find it in Array: ");
		char temp=s1.next().charAt(0);
	
		for(int i=0;i<chararr.length;i++){
			if(temp==chararr[i]){
				System.out.println("Index Number of " + temp + " is " + i);
				break;
			}
			else if(i==(chararr.length-1)){
				System.out.println("Value is not found");
			}
		}
	}
}
