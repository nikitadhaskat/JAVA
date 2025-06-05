package Tasks;

public class Mother extends Thread {
	TV t;
    public Mother(TV t) {
    	this.t=t;
    }
    @Override
    public void run() {
    	t.play(400);
    }
}
