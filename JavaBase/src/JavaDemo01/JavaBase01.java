package JavaDemo01;

import java.util.Scanner;

import org.junit.Test;


public class JavaBase01{
	static String s1="Hello1";
	public long sum=1;
	int x = 45;
	public static int y = 90;
	
	public static void main(String[] args){
		JavaBase01 javaBase = new JavaBase01();
		System.out.println("输入需要测试数据：");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		long outPut = javaBase.Result(input);
		System.out.print("数据类型取值范围：");
		System.out.println("-" + outPut + "~" + (outPut-1));
	}
	@Test
	public long Result(int mi){
		/*
		 整型数据类型内存占用空间
		 byte 8位      8位相当于一个字节   ，一个汉字等于两个字节
		 short   16位
		 int     32位
		 long    64位
		 计算方式 (2^n)-1
		 */
		int i = 1;
		while(i < mi){
			sum*=2;
			mi--;
		}
		return sum;
	}
	
	@Test
	public void JunitTest(){
		System.out.println("测试");
	}
}