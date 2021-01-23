
public class ThreadTest extends Thread {
 static int share;
 
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		
		t1.start();
		t2.start();
		

	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(share++);
			
			try {sleep(10000);}
			catch(InterruptedException e) {
			}
			}
		}
	}


