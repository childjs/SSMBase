package JavaDemo12Thread;
/**
 * 线程优先级
 **/
public class ThreadYXJ {
	//嵌套类
	static class counteThread extends Thread{
		public counteThread(String str){
			super(str);
		}
		@Override
		public void run() {
			int count = 0;
			while(true){
				try {
					sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (count ==5000){
					break;
				}
				System.out.println(getName() + " " +count++);
			}
		}
	}
	public static void main(String args[]){
		counteThread ct1 = new counteThread("线程A");
		counteThread ct2 = new counteThread("线程B");
		ct1.setPriority(1);
		ct2.setPriority(10);
		ct1.start();
		ct2.start();
	}
}
