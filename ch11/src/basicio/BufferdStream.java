package basicio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class BufferdStream {
	public static void main(String[] args) {
		FileOutputStream fos;							// Connection Stream (Source 또는 Destination에 직접 연결)
		BufferedInputStream bis;						// Chain Stream (Sourcr 또는 Destination에 직접 연결이 불가능, Connection Stream에 연결)
 		BufferedOutputStream bos;						// Chain Stream
		String fname = "src/basicio/test.buff";
		
		try {
			// 새로 만들 파일 이름으로 FileOuputStream 생성
			fos = new FileOutputStream(fname);			
			bos = new BufferedOutputStream(fos);
			
			// 한 바이트씩 읽어 FileOutputStream으로 출력
			byte[] data = {'A', 'B', 'C', 'D', 'E'};
			
			bos.write(data, 0, 5);		// write(배열이름, 시작점, length);
			bos.close();
			fos.close();
			System.out.println(fname + " : 파일이 생성되었습니다.");
			
			// 읽을 파일 이름으로 FileInputSteam 생성
			bis = new BufferedInputStream(new FileInputStream(fname));
			data = new byte[10];
			bis.read(data, 0, 10);
			bis.close();			// bis가 fis를 받고 있어서 bis만 닫아줘도 fis닫힘
			System.out.println(Arrays.toString(data));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				System.err.println(e);
			}
	}

}
