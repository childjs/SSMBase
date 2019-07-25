package JavaDemo12Thread;

public class Consumer implements Runnable {
	private Box box;
	public Consumer(Box box){
		this.box = box;
	}
	public void run() {
		for(int i = 0;i < 10;i++){
			int value = box.get();
			System.out.println(Thread.currentThread().getName() + " Consumer" + " get: " + value);
			try {
				Thread.sleep((int)(Math.random())*100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
