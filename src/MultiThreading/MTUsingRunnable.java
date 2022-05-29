package MultiThreading;


class ThreadDemo implements Runnable {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Demo Thread");
		}
	}
}

public class MTUsingRunnable {
	
	public static void main(String args[]) {
		
		ThreadDemo td=new ThreadDemo();
		Thread thread = new Thread(td);
		thread.start();
		
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
	}
}
