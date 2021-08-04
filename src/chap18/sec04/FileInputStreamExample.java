package chap18.sec04;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"D:/00_Limhs/java_data/Java_two/src/chap14/sec05/RunnableExample.java");
				//	"D:/00_Limhs/temp/image1.jpg");	
			int data;
			while ( (data = fis.read() ) != -1) {
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
