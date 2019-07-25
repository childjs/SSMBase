package JavaDemo10reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *java反射机制测试类 
 **/
public class ReflectTest {
	public static void main(String args[]){
		try {
			//1.使用getClass（）获取对象类的名称 ，需要实例化对象
			//Book book = new Book();
			//Class<?> cls1 = book.getClass();
			//System.out.println(cls1);
			//2.使用     类.class  获取类的对象  不实例化直接获取类全名   hibernate  mybatis spring使用
			//Class<?> cls2 = Book.class;
			//System.out.println(cls2);
			//3. 使用Class.forName("类全名") 获取类的全名，不用导包
			/*Class<?> cls = Class.forName("JavaEntity.Book");
			Constructor<?> cons = cls.getConstructor(String.class,int.class); //获取有参构造
			Object obj = cons.newInstance("java开发",111); //实例化对象
			System.out.println(obj);*/
			//4.通过反射调用方法
			/*String fileName = "name";
			Class<?> cls = Class.forName("JavaEntity.Book");
			Object obj = cls.newInstance(); //实例化对象
			Method setMet = cls.getMethod("set" + initCap(fileName), String.class);
			Method getMet = cls.getMethod("get" + initCap(fileName));
			setMet.invoke(obj, "Java数据");
			System.out.println(getMet.invoke(obj));*/
			//5.调用类中私有变量
			Class<?> cls = Class.forName("JavaEntity.Book");
			Object obj = cls.newInstance(); //实例化对象
			Field fieldName = cls.getDeclaredField("Name");
			fieldName.setAccessible(true); //设置是否忽略权限限制，直接访问私有成员
			fieldName.set(obj, "java测试");
			System.out.println(fieldName.get(obj));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String initCap(String str){
		return str.substring(0,1).toUpperCase()+str.substring(1);
	}
}
