package JavaDemo05;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class SwingDemo extends JFrame {
	public void CreateJFrame(String title){
		JFrame jf = new JFrame(title);
		Container container = jf.getContentPane(); //创建容器
		JLabel jl = new JLabel("这是个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(200, 150);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		SwingDemo sd = new SwingDemo();
		sd.CreateJFrame("创建一个JFrame窗体");
	}
}
