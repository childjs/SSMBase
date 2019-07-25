package JavaDemo09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String args[]){
		long start = System.currentTimeMillis();
		File file = new File("F:/JavaFileTest/test.pptx");
		File file2 = new File("F:/JavaFileTest/test2.pptx");
		if (!file.exists()){
			System.out.println("无法实现拷贝，源文件不存在");
			System.exit(0);
		}
		if (!file2.exists()){
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileInputStream fr = new FileInputStream(file);
			FileOutputStream fw = new FileOutputStream(file2);
			//FileReader fr = new FileReader(file);
			//FileWriter fw = new FileWriter(file2);
			byte[] by = new byte[1024];
			//char by[] = new char[1024];
			int temp = 0;
			//int temp = fr.read(by);
			//System.out.println(temp);
			//System.out.println(new String(by, 0, temp));
			//使用缓存字符输入输出流实现文件复制
			/*BufferedReader bufr = new BufferedReader(fr);
			BufferedWriter bufw = new BufferedWriter(fw);
			String s = null;
			while ((s = bufr.readLine()) != null){
				bufw.write(s);
				bufw.newLine();
			}
			bufw.close();
			bufr.close();*/
			
			while((temp = fr.read(by)) != -1){
				//String str = new String(by, 0, temp);
				//System.out.println(str);
				fw.write(by,0,temp);
			}
			fw.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("程序运行耗费时间:" + (end-start));
	}
}
