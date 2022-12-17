import java.util.Scanner;

class Q3{
	public static void main(String[] args){

		Scanner S1=new Scanner(System.in);

		System.out.println("Enter Amount: ");

		int No=S1.nextInt(), Res=0;
		
		while(No>=5000){
			No-=5000;
			Res++;
		}
		
		System.out.println("Rs. 5000\t" + Res);

		Res=0;

		while(No>=1000){
			No-=1000;
			Res++;
		}
		
		System.out.println("Rs. 1000\t" + Res);

		Res=0;

		while(No>=500){
			No-=500;
			Res++;
		}
		
		System.out.println("Rs. 500 \t" + Res);

		Res=0;

		while(No>=100){
			No-=100;
			Res++;
		}
		
		System.out.println("Rs. 100 \t" + Res);

		Res=0;

		while(No>=50){
			No-=50;
			Res++;
		}
		
		System.out.println("Rs. 50  \t" + Res);

		Res=0;

		while(No>=20){
			No-=20;
			Res++;
		}
		
		System.out.println("Rs. 20  \t" + Res);

		Res=0;

		while(No>=10){
			No-=10;
			Res++;
		}
		
		System.out.println("Rs. 10  \t" + Res);

		Res=0;

		while(No>=2){
			No-=2;
			Res++;
		}
		
		System.out.println("Rs. 2   \t" + Res);

		Res=0;

		while(No>=1){
			No-=1;
			Res++;
		}
		
		System.out.println("Rs. 1   \t" + Res);

		Res=0;
	}
}