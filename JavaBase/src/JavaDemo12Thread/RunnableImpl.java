package JavaDemo12Thread;

public class RunnableImpl implements Runnable {

	public void run() {
		for (int i = 0;i < 100;i++){
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " " +i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	public static void main(String args[]){
		RunnableImpl runi = new RunnableImpl();
		Thread t1 = new Thread(runi, "线程A");
		Thread t2 = new Thread(runi, "线程B");
		t1.start();
		t2.start();
	}
}
