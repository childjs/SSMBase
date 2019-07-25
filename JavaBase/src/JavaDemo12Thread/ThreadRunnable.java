package JavaDemo12Thread;
/**
 *继承Thread方法创建线程 
 **/
public class ThreadRunnable extends Thread {
	public ThreadRunnable(String string) {
		super(string);
	}
	public void run(){
		for (int i = 0; i < 100 ;i++){
			System.out.println(getName()+" "+i);
		}
		System.out.println(getName() + " " +"结束");
	}
	public static void main(String args[]){
		Thread tr1 = new ThreadRunnable("线程A");
		Thread tr2 = new ThreadRunnable("线程B");
		tr1.start();;
		tr2.start();
	}
}
