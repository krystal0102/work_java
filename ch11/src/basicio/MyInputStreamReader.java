package basicio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputStreamReader {

	public static void main(String[] args) {

		String line;
		// 읽을 파일 이름 지정
		String fname = "src/basicio/MyInputStreamReader.java";


		try {

			// 읽을 파일 이름으로 FileInputStream 생성
			FileInputStream fis = new FileInputStream(fname);

			// 파일 입력 스트림을 다시 InputStreamReader로 연결
			InputStreamReader isr = new InputStreamReader(fis);		// chain Stream

			// 현재 InputStreamReader의 인코딩 방식 출력
			System.out.println(isr.getEncoding());

			// InpurStreamReader를 다시 BufferdReader로 연결
			BufferedReader br = new BufferedReader(isr);
			System.out.println();

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			br.close();
			isr.close();
			fis.close();

		} catch (FileNotFoundException e) {
			System.out.println("다음 파일이 없습니다: " + fname);
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println();

	}

}
