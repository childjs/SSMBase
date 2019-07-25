package JavaDemo05;
/**
 *使用throw  和 throws 抛出异常
 *throw在方法中使用,throws在声明方法时使用 
 **/
public class Captor {
	public static int quotient(int x, int y) throws MyException {
		if(y < 0){
			throw new MyException("除数不能是负数");
		}
		return x/y;
	}
	public static void main(String args[]){
		try {
			int result = quotient(3, -1);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e){
			System.out.println("除数不能为0");
		} catch (Exception e) {
			System.out.println("程序发生其他异常");
		} finally{
			System.out.println("finally");
		}
	}
}
