package MultiThreading;

public class SleepDemo {

	public static void main(String[] args){
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			try {
				Thread.sleep(2000);		
			}
			catch(Exception e) {
				
			}
		}
		
	}
	
}
