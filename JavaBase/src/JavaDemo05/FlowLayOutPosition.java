package JavaDemo05;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FlowLayOutPosition extends JFrame {
	public FlowLayOutPosition(){
		setTitle("本窗体使用流布局管理器");
		Container c = getContentPane(); //创建容器
		setLayout(new FlowLayout(2, 10, 10));
		for(int i = 0;i < 10;i++){
			c.add(new JButton("button" + i));
		}
		setSize(300, 200); //设置窗口大小
		setVisible(true);  //设置窗口可见
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //设置窗口关闭方式
	}
	public static void main(String[] args){
		new FlowLayOutPosition();
	}
}
