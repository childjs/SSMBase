package JavaDemo12Thread;

public class Box {
	private int data;
	//以下标注的代码可实现线程的锁定，
	//但是容易出现put数据是比get数据时快
	//或者get数据比put 数据快
	/*public synchronized void put(int i){
		data = i;
	}
	public synchronized int get(){
		return data;
	}*/
	//解决方案:加入监视器模块
	//使用wait()方法   notify()方法（唤醒一个线程）或notifyAll()方法（唤醒所有线程）
	private boolean available = false;
	public synchronized void put (int i){
		while(available == true){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		data = i;
		available = true;
		notifyAll(); //唤醒所有线程
	}
	public synchronized int get(){
		while(available == false){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		available = false;
		notifyAll();
		return data;
	}
}
