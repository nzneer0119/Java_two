package chap18.sec02;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample04 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("c:/temp/test04.txt");
		
		String data = "안녕 자바 프로그램";
		
		writer.write(data,3,2);
		writer.flush();
		writer.close();
	}
}