import java.util.Scanner;

class Q3{
	public static void main(String[] args){
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int no =S1.nextInt();
		int count=0;

		for(int x=1;x<=no;x++){
			if(no%x==0){
				count++;
			}
		}
		
		if(count==2){  //count == 2 bcz prime no can only be divided by 1 and itself
			System.out.println("Prime No");
		}
	
		else{
			System.out.println("Not Prime No");
		}
	}
}