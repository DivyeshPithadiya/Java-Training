package MultiThreading;


class JoinThreadDemo extends Thread {
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Demo Thread");
		}
	}
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		
		JoinThreadDemo jd=new JoinThreadDemo();
		jd.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			jd.join();
		}
	}
	
}
