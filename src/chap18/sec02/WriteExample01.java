package chap18.sec02;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample01 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("c:/temp/test.txt");
		char[] data = "홍길동".toCharArray();
		for (int i=0; i<data.length; i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
	}
}