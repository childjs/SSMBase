package JavaDemo08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ArrayListTest {
	public static void main(String args[]){
		Collection<String> arr = new ArrayList<>();
		arr.add("a");
		arr.add("d");
		arr.add("d");
		Iterator<String> it = arr.iterator();  //创建集合迭代器
		while(it.hasNext()){ //读取迭代器中数据
			String str = it.next(); //读取数据
			System.out.println(str);
		}
	}
	/**
	 *List集合测试 
	 **/
	@Test
	public void ListTest(){
		List<String> list = new ArrayList<>();
		list.add("add ");
		list.add("List ");
		list.add("Test ");
		/*
		for (String str : list) {   //foreach循环list
			System.out.println(str);
		}*/
		Iterator<String> it = list.iterator(); //iterator迭代器迭代list
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	@Test
	public void ListArrTest(){
		List<String> arrList = new ArrayList<>();
		arrList.add("add");
		arrList.add("ArrayList");
		arrList.add("Test");
		int i = (int)(Math.random()*(arrList.size()-1));
		System.out.println("随机获得集合中的数据是 " + arrList.get(i));
		arrList.remove(2);
		System.out.println("移除指定下标中数据后的字符串是");
		for (int j = 0;j < arrList.size();j++){
			System.out.println(arrList.get(j));
		}
	}
}
