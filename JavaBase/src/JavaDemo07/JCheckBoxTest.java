package JavaDemo07;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class JCheckBoxTest extends JFrame {
	JTextArea ta = new JTextArea(20, 30);
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JCheckBox jc1 = new JCheckBox("复选框一");
	JCheckBox jc2 = new JCheckBox("复选框二");
	JCheckBox jc3 = new JCheckBox("复选框三");
	public JCheckBoxTest(){
		Container c = getContentPane();
		setTitle("复选框测试");
		setVisible(true);
		setSize(500, 500);
		c.setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JScrollPane sp = new JScrollPane(ta);
		jp1.add(sp);
		jp2.add(jc1);
		jp2.add(jc2);
		jp2.add(jc3);
		c.add(jp1, BorderLayout.NORTH);
		c.add(jp2, BorderLayout.CENTER);
		jc1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (jc1.isSelected()){
					ta.append("1");
				}
			}
		});
		jc2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (jc2.isSelected()){
					ta.append("2");
				}
			}
		});
		jc3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (jc3.isSelected()){
					ta.append("3");
				}
			}
		});
		
	}
	public static void main(String args[]){
		new JCheckBoxTest();
	}
}
