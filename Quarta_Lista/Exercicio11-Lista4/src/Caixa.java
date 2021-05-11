
public class Caixa {
	private int contents;
    private boolean available = false;

    public synchronized int get(int who) {
        while (available == false) {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        available = false;
        System.out.println("Consumidor " + who + " got: " + contents);
        notifyAll();
        return contents;
    }

    public synchronized void put(int who, int value) {
        while (available == true) {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        contents = value;
        available = true;
        System.out.println("Produtor " + who + " put: " + contents);
        notifyAll();
    }
}
