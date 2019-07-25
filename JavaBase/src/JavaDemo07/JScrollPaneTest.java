package JavaDemo07;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class JScrollPaneTest extends JFrame {
	/**
	 *创建文本域编辑框必须先初始化编译器类为JTextArea类，并在初始化时指定编译器的大小 
	 **/
	public static void main(String args[]){
		JFrame jf = new JFrame();
		Container c = jf.getContentPane();
		JTextArea ta = new JTextArea(20, 30);
		JScrollPane sp = new JScrollPane(ta);
		c.add(sp);
		jf.setTitle("JScrollPane滚动条面板测试");
		jf.setVisible(true);
		jf.setSize(200, 200);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
