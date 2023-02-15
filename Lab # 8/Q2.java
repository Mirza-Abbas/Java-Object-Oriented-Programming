class mother{
	void display(){
		System.out.println("\nThis is Mother Class");
	}
}

class daughter extends mother{
	void display(){
		System.out.println("\nThis is Daughter Class");
	}
}

class Q2{
	public static void main(String[] args){
		mother d=new daughter();
		d.display();
	}
}