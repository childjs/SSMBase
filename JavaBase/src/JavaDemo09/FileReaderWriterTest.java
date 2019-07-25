package JavaDemo09;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class FileReaderWriterTest extends JFrame {
	private JScrollPane scrollPane; //创建滚条面板
	private JPanel jContentPane=null; //创建面板
	private JTextArea jTextArea=null; //创建文本域
	private JPanel controlPane=null; //创建面板
	private JButton openButton=null; //创建写入按钮
	private JButton closeButton=null; //创建读取按钮
	private JTextArea getjTextArea() {
		if (jTextArea == null){
			jTextArea = new JTextArea();
		}
		return jTextArea;
	}
	
	
	private JPanel getControlPane() {
		if (controlPane == null){
			FlowLayout flowLayout = new FlowLayout();
			flowLayout.setVgap(1);
			controlPane = new JPanel();
			controlPane.setLayout(flowLayout);
			controlPane.add(getOpenButton(), null);
			controlPane.add(getCloseButton(), null);
		}
		return controlPane;
	}
	private JButton getOpenButton() {
		if (openButton == null){
			openButton = new JButton();
			openButton.setText("写入文件");
			openButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					File file = new File("F:/JavaFileTest/word.txt");
					try {
						FileWriter fw = new FileWriter(file,true);
						String s = jTextArea.getText();
						fw.write(s);//将文本域中数据写入到文档中
						fw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			});
		}
		return openButton;
	}
	private JButton getCloseButton() {
		if (closeButton == null){
			closeButton = new JButton();
			closeButton.setText("读取文件");
			closeButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					File file = new File("F:/JavaFileTest/word.txt");
					try {
						FileReader fr = new FileReader(file);
						char byt[] = new char[1024];
						int len = fr.read(byt);
						jTextArea.setText(new String(byt, 0, len));
						fr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			});
		}
		return closeButton;
	}
	
	public FileReaderWriterTest(){
		super();
		initialize();
	}
	private void initialize(){
		this.setSize(300, 200);
		this.setContentPane(getjContentPane());
		this.setTitle("文本编辑器");
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	private JPanel getjContentPane() {
		if (jContentPane == null){
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getScrollPane(), BorderLayout.CENTER);
			jContentPane.add(getControlPane(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}
	public static void main(String args[]){
		FileReaderWriterTest fret = new FileReaderWriterTest();
		
	}
	protected JScrollPane getScrollPane() {
		if (scrollPane == null){
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getjTextArea());
		}
		return scrollPane;
	}
}
