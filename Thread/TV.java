package Tasks;

public class TV {
	public synchronized void play(int channel) {
	
   try {
	   for(int i=1;i<=10;i++) {
		   System.out.println("Playing "+channel);
		   Thread.sleep(1000);
	   }
   }
   catch(Exception e) {
	}
  }
}
