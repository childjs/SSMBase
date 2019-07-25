package JavaDemo04;

import org.junit.Test;

public class ExceptionTest {
/**
 *异常测试 
 **/
	@Test
	public void Err(){
		try {
			String str = "tom";
			System.out.print(str + " 的年龄是:");
			int age = Integer.parseInt("20L");
			System.out.println(age);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("program over");
	}
}
