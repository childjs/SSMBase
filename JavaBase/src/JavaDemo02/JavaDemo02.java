package JavaDemo02;

import org.junit.Test;

import JavaDemo01.JavaBase01;

public class JavaDemo02 {
	public int z = 10;
	@Test
	public void JunitTest(){
		int z = JavaBase01.y;
		System.out.println(z);
	}
	@Test
	public void Assignment(){
		int x,y,a,b;
		x = 10;
		y = a = b = x+2;
		a = b + 10;
		System.out.println("y的值:");
		System.out.println("a和b的值:" + a + ":" + b);
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(y % x);
		System.out.println(a % x);
	}
	/**
	 * 三元运算
	 * */
	@Test
	public void syys(){
		int x,y,z;
		x = 10;
		y = 12;
		z = x > y?1 : 0;
		System.out.println(z);
	}
	@Test
	public void zh(){
		byte b = (byte)127;
		System.out.println(b);
	}
	/**
	 * switch语句测试
	 * */
	@Test
	public void switchTest(){
		int x,y;
		x = 10;
		switch(x){
		case 5 : y = 1;break;
		case 8 : y = 2;break;
		case 11 : y = 3;break;
		default: y = 4;
		}
		System.out.println(y);
	}
	/**
	 *while循环语句测试 
	 **/
	@Test
	public void whileTest(){
		int x = 1;
		int sum = 0;
		while(x < 10){
			sum+=x;
			x++;
		}
		System.out.println(sum);
	}
	/**
	 *for循环语句测试 
	 **/
	@Test
	public void forTest(){
		int sum = 0;
		int i;
		for (i = 2;i<=100;i+=2){
			sum = sum + i;
		}
		System.out.println("2到100的偶数和为:" + sum);
	}
	/**
	 *foreach循环语句测试，多用于遍历数组
	 **/
	@Test
	public void foreachTest(){
		int arr[] = {1,2,5,10,3};
		System.out.println("一维数组中的元素分别为：");
		for (int x : arr){
			System.out.println(x);
		}
	}
}
