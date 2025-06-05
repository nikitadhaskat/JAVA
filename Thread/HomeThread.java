package Tasks;

public class HomeThread {
	public static void main(String[] args) {
		
		timerThread t1=new timerThread();
		Thread tt1=new Thread(t1);
		musicThread t2=new musicThread();
		Thread tt2=new Thread(t2);
		downloadThread t3=new downloadThread();
		Thread tt3=new Thread(t3);
		
		tt1.start();
		tt2.start();
		tt3.start();

	}
}
