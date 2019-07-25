package JavaDemo09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapText {
	public static void main(String args[]){
		Map<String, String> map = new HashMap<>();
		Emp emp = new Emp("001", "张三");
		Emp emp2 = new Emp("005", "李四");
		Emp emp3 = new Emp("002", "王五");
		map.put(emp.getE_id(), emp.getE_name());//map.put(key,value);
		map.put(emp2.getE_id(), emp2.getE_name());
		map.put(emp3.getE_id(), emp3.getE_name());
		Set<String> set = map.keySet(); //获取Map集合中所有KEY对象形成的Set集合
		Iterator<String> it = set.iterator();
		System.out.println("HashMapp类实现的Map集合,无序:");
		while(it.hasNext()){
			String str = it.next();
			String name = map.get(str); //通过key值获取value值Map(key,value)
			System.out.println(str + " " +name );
		}
		TreeMap<String, String> treemap = new TreeMap<>(); //创建TreeMap集合对象
		treemap.putAll(map);
		Iterator<String> iter = treemap.keySet().iterator();
		System.out.println("TreeMap类实现的Map集合，键对升序:");
		while(iter.hasNext()){
			String str2 = iter.next();
			String name = treemap.get(str2);
			System.out.println(str2 +" "+ name);
		}
	}
}
