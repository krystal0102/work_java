package excercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	
	// public static final String PATH = "src/excercise/";
	
	public static void main(String[] args) {
		// 파일 객체화
		File origin = new File(args[0]);		// 원본 파일
		File copy = new File(args[1]);		// 앞으로 생성될 파일
		
		try {
			// Connection Stream
			FileInputStream fis = new FileInputStream(origin);
			FileOutputStream fos = new FileOutputStream(copy);
			
			int data = -1;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			
			fos.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
