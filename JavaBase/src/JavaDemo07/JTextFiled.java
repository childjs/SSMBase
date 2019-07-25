package JavaDemo07;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class JTextFiled extends JFrame implements ActionListener{
	JTextField jt1;
	JTextField jt2;
	JTextField jt3;
	public JTextFiled(){
		setTitle("TextFiled测试");
		Container c = getContentPane();
		setVisible(true);
		setSize(400, 400);
		setLocationRelativeTo(null);
		//pack(); //以紧凑形式显示窗口
		//setResizable(false); //设置用户不能改变窗口大小
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		jt1 = new JTextField(5);
		jt2 = new JTextField(5);
		jt3 = new JTextField(8);
		JButton jb1 = new JButton("加法");
		JButton jb2 = new JButton("减法");
		JButton jb3 = new JButton("乘法");
		JButton jb4 = new JButton("除法");
		jp1.setLayout(new FlowLayout());
		jp1.add(new JLabel("操作数一:"));
		jp1.add(jt1);
		jp1.add(new JLabel("操作数二:"));
		jp1.add(jt2);
		jp1.add(new JLabel("结果:"));
		jp1.add(jt3);
		jt3.setEditable(false);
		jp2.setLayout(new FlowLayout());
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		c.add(jp1, BorderLayout.CENTER);
		c.add(jp2, BorderLayout.PAGE_END);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("加法")){
			calculate('+');
		}
		else if (command.equals("减法")){
			calculate('-');
		}
		else if (command.equals("乘法")){
			calculate('*');
		}
		else if (command.equals("除法")){
			calculate('/');
		}
	}
	public void calculate(char operator){
		int num1 = Integer.parseInt(jt1.getText().trim());
		int num2 = Integer.parseInt(jt2.getText().trim());
		int result = 0;
		switch(operator){
		case '+':result = num1 + num2;break;
		case '-':result = num1 - num2;break;
		case '*':result = num1 * num2;break;
		case '/':result = num1 / num2;break;
		}
		jt3.setText(Integer.toString(result));
	}
	public static void main(String args[]){
		new JTextFiled();
	}

}
