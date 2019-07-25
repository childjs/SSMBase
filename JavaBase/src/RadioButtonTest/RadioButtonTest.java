package RadioButtonTest;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class RadioButtonTest extends JFrame {
	public RadioButtonTest(){
		setTitle("单选框测试");
		Container c = getContentPane(); //创建窗体
		setVisible(true);
		setSize(400, 200);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(1, 10, 10));
		JRadioButton jr1 = new JRadioButton("按钮一");
		JRadioButton jr2 = new JRadioButton("按钮二");
		c.add(jr1);
		c.add(jr2);
	}
	public static void main(String args[]){
		new RadioButtonTest();
	}
}
