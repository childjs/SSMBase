package JavaDemo12Thread;

public class Producer implements Runnable {
	private Box box;
	public Producer(Box box){
		this.box = box;
	}
	public void run() {
		for(int i = 0;i < 10;i++){
			box.put(i);
			System.out.println(Thread.currentThread().getName() + " Producer" + " put: " + i);
			try {
				Thread.sleep((int)(Math.random())*100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
