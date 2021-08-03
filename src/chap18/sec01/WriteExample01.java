package chap18.sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample01 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/temp/test01.txt");
		byte[] data = "LHS".getBytes();
		for (int i=0; i<data.length; i++) {
			os.write(data[i]);
		}
		os.flush();
		os.close();
	}
}