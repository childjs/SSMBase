package JavaDemo09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class FileTest {
	public static void main(String args[]){
		File file = new File("F:/JavaFileTest/word.txt"); //读取磁盘中文件
		if (file.exists()){ //如果文件已存在
			file.delete(); //删除文件
			System.out.println("文件已删除");
		}
		else{
			try {
				file.createNewFile();
				System.out.println("文件已创建");
			} catch (IOException e) {
				System.out.println("文件读取异常");
				e.printStackTrace();
			}
			
		}
	}
	@Test
	public void FileInfoTest(){
		File file = new File("F:/JavaFileTest/word.txt");
		if(file.exists()){
		String fileName = file.getName(); //获取文件名
		String filePath = file.getAbsolutePath(); //获取文件绝对地址
		long fileLength = file.length(); //获取文件长度（字节长度）
		boolean hidden = file.isHidden(); //文件是否隐藏
		boolean canread = file.canRead(); //是否可读
		boolean canwrite = file.canWrite(); //是否可写
		String parentPath = file.getParent(); //获取文件的父路径
		System.out.println("文件名：" + fileName);
		System.out.println("文件地址:" + filePath);
		System.out.println("文件长度:" + fileLength);
		System.out.println("文件是否隐藏:" + hidden);
		System.out.println("文件是否可读：" + canread);
		System.out.println("文件是否可写:" + canwrite);
		System.out.println("文件父路径:" + parentPath);
		}
		else{
			System.out.println("对应路径下文件不存在");
		}
	}
	@Test
	public void FileIOStream(){
		File file = new File("F:/JavaFileTest/word.txt");
		if (file.exists()){
			try {
				FileOutputStream out = new FileOutputStream(file);
				byte buy[] = "我有一只小毛驴，从来也不骑。".getBytes();
				out.write(buy);
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				try {
					FileInputStream input = new FileInputStream(file);
					byte byt[] = new byte[1024];
					int len = input.read(byt);
					System.out.println("文件中信息是:"+ new String(byt, 0, len));
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
	}
}
