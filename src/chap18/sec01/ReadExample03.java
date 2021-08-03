package chap18.sec01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample03 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("c:/temp/test.txt");
		int readByteNo;
		byte[]readBytes = new byte[8];
		readByteNo = is.read(readBytes,1,5);
			for(int i=0; i<readBytes.length;i++) {
				System.out.print((char)readBytes[i]); //강제 형변환
		}
		is.close();
	}
}