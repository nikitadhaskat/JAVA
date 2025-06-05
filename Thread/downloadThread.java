package Tasks;

public class downloadThread implements Runnable{
	
	@Override
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println("Downloading... " +i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			
		}
	}

}
