package Tasks;

public class Home {
	public static void main(String[] args) {
		
		TV t=new TV();
		Father f=new Father(t);
		Mother m=new Mother(t);
		You y=new You(t);
		
		f.start();
		m.start();
		y.start();
		

	}
	

}
