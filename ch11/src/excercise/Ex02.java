package excercise;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02 {
public static void main(String[] args) {
		
		int data;
		
		String fname = "src/excercise/coco.jpg";
		
		FileInputStream fis = null;
		BufferedInputStream bis;
		
		try {

			fis = new FileInputStream(fname);
			bis = new BufferedInputStream(fis);	// 파일을 빠르게 읽기 위해서 사용했다
			
			while ((data = bis.read()) != -1 ) {
				char c = (char) data;		// 글의 번호가 아닌 문자자체를 찍기 위해 타입캐스팅을 해줌
				System.out.print(c);
			}
			
			fis.close();
			bis.close();
			
		} catch (FileNotFoundException e){
			System.err.println("다음 파일이 없습니다: " + fname);
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println();
		
	}

	
	
	

}
