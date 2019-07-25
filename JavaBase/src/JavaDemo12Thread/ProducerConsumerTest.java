package JavaDemo12Thread;

public class ProducerConsumerTest {
	public static void main(String args[]){
		Box box = new Box();
		Producer pro = new Producer(box);
		Consumer con = new Consumer(box);
		Thread th1 = new Thread(pro, "线程A");
		Thread th2 = new Thread(con,"线程B");
		th1.start();
		th2.start();
	}
	
	
}
