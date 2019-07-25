package JavaDemo11FX;

import JavaEntity.FXBook;

public class JavaDemo11FX {
	public static void main(String args[]){
		FXBook<String> fxb = new FXBook<String>();
		fxb.setName("Java测试");
		fxb.setDesc("测试Java");
		System.out.println(fxb.getDesc());
		System.out.println(fxb.getName());
		FXBook<Double> fxb2 = new FXBook<Double>();
		fxb2.setPrice(23.1);
		System.out.println(fxb2.getPrice());
	}
}
