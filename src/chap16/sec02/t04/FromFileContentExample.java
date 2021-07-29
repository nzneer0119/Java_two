package chap16.sec02.t04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:/00_Limhs/java_data/datafile/linedata.txt");
		Stream<String> stream;
		
		System.out.println("- Files.lines() 메소드 이용 -");
		System.out.println();
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach( System.out :: println);
		System.out.println();
		System.out.println();
		
		System.out.println("- BufferedReader의 lines() 메소드 이용 -");
		System.out.println();
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach( System.out :: println);
	}
}
