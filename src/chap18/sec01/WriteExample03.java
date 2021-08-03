package chap18.sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample03 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/temp/test03.txt");
		byte[] data = "ABCD".getBytes();
		os.write(data,1,2);
		os.flush();
		os.close();
	}
}