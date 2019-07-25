package JavaDemo12Thread;
/**
 *线程锁实现 
 **/
public class ThreadXCS implements Runnable {
	int count = 100;
	int n = 0;
	/*同步方法，共享资源使用*/
	/*public synchronized void syc(){
		if (count > 0){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count--;
			n++;
			System.out.println(Thread.currentThread().getName()+ " " + n);
		}
		
	}*/
	public void run() {
		
		while(true){
			//syc();
			/*同步块*/
			synchronized ("") {
				if (count > 0){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					count--;
					n++;
					System.out.println(Thread.currentThread().getName()+ " " + n);
					String ThreadName=Thread.currentThread().getName();
					if (ThreadName == "售票窗口一"){
						break;
					}
				}
				else{
					break;
				}
			}
			/*if (count<1){
				break;
			}*/
			
		}
	}
	public static void main(String args[]){
		ThreadXCS tx = new ThreadXCS();
		Thread th2 = new Thread(tx, "售票窗口二");
		Thread th = new Thread(tx, "售票窗口一");
		
		//Thread th3 = new Thread(tx, "售票窗口三");
		//Thread th4 = new Thread(tx, "售票窗口四");
		th.start();
		th2.start();
		//th3.start();
		//th4.start();
	}
}
