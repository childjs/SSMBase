package JavaDemo04;

import org.junit.Test;

public class JavaExtendsTest extends JavaDemo04 {
	public JavaExtendsTest(){
		super();
		super.test1();
	}
	public void testNew(){
		
	}
	public void test1(){
		
	}
	public JavaExtendsTest test2(){
		return new JavaExtendsTest();
	}
	/**
	 *getClass()方法和toString()方法测试 
	 **/
	public String toString(){
		return "在" + getClass().getName() + "类中重写toString方法";
	}
	@Test
	public void test3(){
		System.out.println(new JavaExtendsTest());
	}
}
