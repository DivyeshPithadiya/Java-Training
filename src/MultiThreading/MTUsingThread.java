package MultiThreading;


class Demo extends Thread {
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Demo Thread");
		}
	}
}

public class MTUsingThread {
	
	public static void main(String args[]) {
		 
		Demo d=new Demo();
		d.start();
		
		System.out.println(d.getPriority());
		d.setPriority(10);
		System.out.println(d.getPriority());
		 
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}
	
}


