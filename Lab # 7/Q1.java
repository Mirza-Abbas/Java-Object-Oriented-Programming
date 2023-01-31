class Mythread1 extends Thread{
	int no=0;
	public void run(){
		try{
			for(int i=0;i<=20;i++){
				System.out.println(no);
				no+=2;
				if(no==30){
				Thread.sleep(5000);
				}
			}
		}
		catch(Exception e){
			System.out.println("Something went Wrong");
		}
	}	
}

class Q1{
	public static void main(String[] args){
		Mythread1 DemoThread=new Mythread1();
		System.out.println("Even Numbers: ");
		DemoThread.start();
	}
}