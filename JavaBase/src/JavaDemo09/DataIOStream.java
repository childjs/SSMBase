package JavaDemo09;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOStream {
	public static void main(String args[]){
		try {
			FileOutputStream fos = new FileOutputStream("F:/JavaFileTest/word.txt");
			DataOutputStream dis = new DataOutputStream(fos);
			dis.writeUTF("使用UTF写入数据");
			dis.writeChars("使用chars写入数据");
			dis.writeBytes("使用bytes写入数据");
			dis.writeInt(1);
			dis.close();
			FileInputStream fis = new FileInputStream("F:/JavaFileTest/word.txt");
			DataInputStream ds = new DataInputStream(fis);
			System.out.println(ds.readUTF());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
