
public class Membro2 extends Thread{
private Trabalho trabalho;
	
	public Membro2(Trabalho c) {
		trabalho = c;
	}
	
	public void run() {
		
		try {
			trabalho.put();
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
}
