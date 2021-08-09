package chap19.sec02;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;

public class PerformanceExample {

	public static void main(String[] args) throws Exception {
		Path from = Paths.get("D:/00_Limhs/temp/test01.txt");
		Path to1 = Paths.get("D:/00_Limhs/temp/test02.txt");
		Path to2 = Paths.get("D:/00_Limhs/temp/test03.txt");
		
		long size = Files.size(from);
		
		FileChannel fileChannel_from = FileChannel.open(from);
		FileChannel fileChannel_to1 = FileChannel.open(to1,  EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE));
	}

}
