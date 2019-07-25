package JavaDemo09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedReaderWriterTest {
	public static void main(String args[]){
		String str[]={"测试1","测试2","测试3"};
		File file = new File("F:/JavaFileTest/word.txt");
		try {
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 0;i < str.length;i++){
				bw.write(str[i]);//往文本中写入数据
				bw.newLine();//创建行分割符
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			//FileReader fr = new FileReader(file);
			FileReader fr = new FileReader("F:/JavaFileTest/word.txt");
			BufferedReader br = new BufferedReader(fr);
			int j = 0;
			String s = null;
			while((s = br.readLine()) != null){
				j++;
				System.out.println("第" + j +"行数据是:" + s);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
