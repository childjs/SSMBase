package JavaDemo07;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class JavaDemo07 extends JFrame {
	public void JframTest(String title){
		setTitle(title);
		Container c = getContentPane();
		setVisible(true);
		setSize(400, 400);
		setLayout(new GridLayout(2, 1, 10, 10));
		setLocationRelativeTo(null); //设置窗体居中
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JPanel jp1 = new JPanel(new GridLayout(1, 3, 10, 10)); //设置面板
		JPanel jp2 = new JPanel(new GridLayout(1, 2, 10, 10));
		JPanel jp3 = new JPanel(new GridLayout(1, 2, 10, 10));
		JPanel jp4 = new JPanel(new GridLayout(2, 1, 10, 10));
		jp1.add(new JButton("1"));
		jp1.add(new JButton("2"));
		jp1.add(new JButton("3"));
		jp2.add(new JButton("4"));
		jp2.add(new JButton("5"));
		jp3.add(new JButton("6"));
		jp3.add(new JButton("7"));
		jp4.add(new JButton("8"));
		jp4.add(new JButton("9"));
		c.add(jp1);
		c.add(jp2);
		c.add(jp3);
		c.add(jp4);
		
	}
	public static void main(String args[]){
		new JavaDemo07().JframTest("不滚动面板测试");
	}
}
