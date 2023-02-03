class Storage{
	static int[] num=new int[10];
}

class Counter extends Thread{	
	public void run(){
		for(int i=0;i<Storage.num.length;i++){
			Storage.num[i]=i;
		}
	}
}

class Printer extends Thread{	
	public void run(){
		for(int i=0;i<Storage.num.length;i++){
			System.out.println(Storage.num[i]);
		}
	}
}

class Q2{	
	public static void main(String[] args){
		Counter c=new Counter();
		c.start();
		Printer p=new Printer();
		p.start();
	}
}

