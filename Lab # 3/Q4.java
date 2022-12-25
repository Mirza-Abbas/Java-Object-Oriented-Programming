class Q4{
	public static void main(String [] args){

		int z=1;	

		for(int rows=1;rows<=5;rows++){

			if(rows<=3){

				for(int spaces=3;spaces>=z;spaces--){
					System.out.print(" ");

					z++;
				}

				for(int x=1;x<=rows*2-1.;x++){
					System.out.print("*");
				}

				System.out.print("\n");
			}

			if(rows>3){

				for(int spaces=1;spaces<=rows-3;spaces++){
					System.out.print(" ");
				}

				for(int v=9;v>=rows*2-1;v--){
					System.out.print("*");
				}

				System.out.print("\n");
			}
		}
	}
}