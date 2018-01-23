package excercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyClass {
	public static void main(String[] args) {


		try {
			// Connection  Stream
			FileReader fr = new FileReader("src/excercise/MyClass.java");
			FileWriter fw = new FileWriter("src/excercise/MyClass.num");
			// Chain Stream
			BufferedReader br = new BufferedReader(fr);				// 한 줄씩 읽으려고.. BufferedReader 의 readLine()메소드가 한줄씩 읽어주니까 사용한거임
			BufferedWriter bw = new BufferedWriter(fw);

			String data;
			// 여기서 i는 줄 번호겠지
			for (int i = 1; (data = br.readLine()) != null; i++) {
				bw.write(i + " " + data + "\n");
			}

			// 항상 닫을때는 Chain먼저
			br.close();
			bw.close();
			fr.close();
			fw.close();

		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
