package chap18.sec02;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample02 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("c:/temp/test.txt");
		char[] data = "길동이".toCharArray();
		writer.write(data); //for문 제거
		writer.flush();
		writer.close();
	}
}