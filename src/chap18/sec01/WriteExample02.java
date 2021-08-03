package chap18.sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample02 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/temp/test02.csv");
		byte[] data = "10,30,50,60".getBytes();
		os.write(data);
	}
}