package JavaDemo03;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

public class JavaDemo03 {
	/**
	 *字符串测试 
	 **/
	@Test
	public void stringTest(){
		String s = new String("goog");
		String x = "java";
		System.out.println(s);
		System.out.println(x);
	}
	/**
	 *字符串长度测试 
	 **/
	@Test
	public void stringLenTest(){
		String x = "We are students";
		int size = x.length();
		System.out.println(size);
	}
	/**
	 *字符串查找 
	 **/
	@Test
	public void findChar(){
		String x = "We are students";
		int size = x.indexOf("r");
		int none = x.indexOf("y");
		System.out.println("字符串中包含的字母索引位置在：" + size + "位");
		System.out.println(none);
	}
	/**
	 *字符串截取测试 
	 *str.substring(int beginIndex)表示从哪个下标开始截取到最后
	 *str.substring(int beginIndex,int endIndex)表示从开始下标到结束下标前一个位置截取
	 *如str.substring(1,3)   截取位置：1<=x<3
	 **/
	@Test
	public void subStringTest(){
		String str = "hello word";
		String subStr = str.substring(2);
		String subStr2 = str.substring(1, 4);
		System.out.println(subStr);
		System.out.println(subStr2);
	}
	/**
	 *取出字符串中的空格 
	 **/
	@Test
	public void trimTest(){
		String str = "  hello  word";
		System.out.println("原字符串" + str);
		String str2 = str.trim();
		System.out.println("替换空格后字符串" + str2);
	}
	/**
	 *字符串替换测试 
	 **/
	@Test
	public void replaceTest(){
		String str = "address";
		System.out.println("原字符串：" + str);
		String str2 = str.replace("a", "A");
		System.out.println("替换后字符串：" + str2);
	}
	/**
	 *equals比较的是值   ==比较的是如果是对象则比较对象，如果是值则比较值
	 **/
	@Test
	public void equalsTest(){
		String str1 = "hello";
		String str2 = "Hello";
		String str3 = "hello";
		String str4 = new String("hello");
		String str5 = new String("Hello");
		boolean b = str1.equals(str3);
		boolean c = str1.equals(str2);
		boolean d = (str1 == str3);
		boolean e = str1.equalsIgnoreCase(str2);
		boolean f = str4.equals(str5);
		boolean g = (str4 == str5);
		System.out.println("hello equals hello = " + b);
		System.out.println("hello equals Hello = " + c);
		System.out.println("hello == hello = " + d);
		System.out.println("hello equalsIgnoreCase Hello = " + e);
		System.out.println("hello equals hello = " + f);
		System.out.println("hello == hello = " + g);
	}
	/**
	 *字符串大小写转换 
	 **/
	@Test
	public void steLowerUpTest(){
		String str = "hello";
		String newStr = str.toUpperCase();
		System.out.println(newStr);
		String newStr2 = newStr.toLowerCase();
		System.out.println(newStr2);
	}
	/**
	 *日期格式化 
	 **/
	@Test
	public void dateTest(){
		Date date = new Date();
		String year = String.format("%tY", date);
		String month = String.format("%tB", date);
		String Day = String.format("%td", date);
		String week = String.format("%tA", date);
		System.out.println("当天日期:" + year + "年" + month  + Day + "日" + week);
	}
	/**
	 *一维数组测试 
	 **/
	@Test
	public void arrayTest(){
		//int day[] = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0;i < 12;i++){
			System.out.println((i + 1)+"月有" + day[i] + "天");
			}
	}
	/**
	 *数组排序测试  Arrays.sort(arr)
	 **/
	@Test
	public void arrSortTest(){
		int arr[]={30,10,1,40};
		Arrays.sort(arr);
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	/**
	 * this关键字使用,this关键字代替本类对象
	 **/
	@Test
	public void thisTest(){
		int ret = this.thisResult();
		System.out.println(ret);
	}
	public int thisResult(){
		return 1;
	}
	/**
	 *无参构造方法 
	 **/
	/*public JavaDemo03(){
		this("this调用有参构造方法");
		System.out.println("无参构造");
	}
	public JavaDemo03(String name){
		System.out.println(name);
	}
	public static void main(String args[]){
		JavaDemo03 jd = new JavaDemo03();
	}*/
	/**
	 *随机数 
	 **/
	@Test
	public void randomTest(){
		System.out.print("请输入猜的数字:");
		Scanner sc = new Scanner(System.in);
		int inputData = sc.nextInt();
		int rand=(int)(Math.random()*100) + 1;
		while(inputData != rand){
			if (inputData > rand){
				System.out.print("没猜对,录入数字太大,请在输入:");
			}else{
				System.out.print("没猜对,录入数字太小,请在输入:");
			}
			inputData = sc.nextInt();
		}
		System.out.println("恭喜答对了");
	}
}
