package Tasks;

public class Father extends Thread {

	TV t;
	public Father(TV t) {
		this.t=t;
	}
	@Override
	public  void run() {
         t.play(300);
	}
}
