package MultiThreading;

class Demo1 extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Demo");
			Thread.yield();
		}
	}
	
}

public class YieldDemo {
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main");
		}
	}
}
