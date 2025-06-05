package Tasks;

public class You extends Thread{
	
	TV t;
	public You(TV t) {
		this.t=t;
	}
	@Override
	public void run() {
		t.play(500);
	}
}
