package JavaDemo06;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JavaDemo06 extends JFrame {
	/*public JavaDemo06(){
		setTitle("测试窗体");
		Container c = getContentPane(); //创建窗体
		JButton jbu = new JButton("按钮一");
		c.add(jbu);
		setVisible(true);
		setSize(100, 200);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}*/
	public JavaDemo06(){
		setTitle("流布局测试");
		Container c = getContentPane();   //创建窗体
		setLayout(new FlowLayout(2, 10, 10));  //设置布局为流布局
		for (int i = 0;i < 10;i++){
			c.add(new JButton("button" + i)); //添加按钮
		}
		setSize(300, 200); //设置窗体长宽
		setVisible(true);  //设置窗体是否可见
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //设置窗体关闭方式
		
	}
	public static void main(String args[]){
		new JavaDemo06();
	}
	
}
