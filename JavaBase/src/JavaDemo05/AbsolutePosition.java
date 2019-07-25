package JavaDemo05;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
/**
 *绝对布局 
 **/
public class AbsolutePosition extends JFrame {
	public static void main(String args[]){
		new AbsolutePosition();
	}
	public AbsolutePosition(){
		setTitle("本窗口使用绝对布局");
		setLayout(null);
		setBounds(500, 500, 200, 150);
		Container c = getContentPane();
		JButton b1 = new JButton("按钮一");
		JButton b2 = new JButton("按钮二");
		b1.setBounds(10, 30, 80, 30);
		b2.setBounds(60, 70, 100, 20);
		c.add(b1);
		c.add(b2);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
}
