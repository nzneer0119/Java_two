package chap18.sec02;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample03 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("c:/temp/test.txt");
		char[] data = "길동이".toCharArray();
		writer.write(data,1,2);
		writer.flush();
		writer.close();
	}
}