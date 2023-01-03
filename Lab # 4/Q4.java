import java.util.Scanner;
class Q4{
	public static void main(String[] args){
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter Marks for English: ");
		float eng=S1.nextInt();
		System.out.println("Enter Marks for Physics: ");
		float phy=S1.nextInt();
		System.out.println("Enter Marks for Maths: ");
		float mth=S1.nextInt();
		System.out.println("Enter Marks for Chemistry: ");
		float che=S1.nextInt();
		System.out.println("Enter Marks for Geography: ");
		float geo=S1.nextInt();
		float perc=(eng+phy+mth+che+geo)/5;
		System.out.println("Percentage: " + perc);
		
		if(perc>90){
			System.out.println("Grade A+");
		}

		else if(perc>=83){
			System.out.println("Grade A");
		}

		else if(perc>=75){
			System.out.println("Grade B+");
		}


		else if(perc>=65){
			System.out.println("Grade B");
		}
		
		else if(perc>=60){
			System.out.println("Grade C+");
		}

		else if(perc>=50){
			System.out.println("Grade C");
		}

		else{
			System.out.println("F");
		}
	}
}