package basicio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayIO {

	public static void main(String[] args) {

		int c;
		byte[] b = {'a', 'b', 'c', 'd'}; // 바이트 타입으로 저장했기 때문에 이 문자들은 바이트타입으로 저장되어 있음. 바이트 안의 숫자들은 1바이트

		// 배열 b를 읽는 ByteArrayInputStream 객체를 생성
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);

		// 배열 b의 소문자를 대문자로 출력하는 ByteArrayOutputStream 객체를 생성 
		ByteArrayOutputStream bOutput = new ByteArrayOutputStream();
		// ByteArray는 1byte씩 읽어오고, 영문자는 1byte씩임

		System.out.println("문자를 읽어 대문자로 출력");
		
		while ((c = bInput.read()) != -1) {	// 여기서 -1은 배열의 끝 (d다음이 -1)
			
			System.out.print((char) c);		
	
			// 객체 ByteArrayOutputStream을 대문자로 출력
			bOutput.write(Character.toUpperCase((char) c));

		}
		System.out.println();
		
		// 객체 ByteArrayOutputStream을 출력하면 출력된 자료가 그대로 출력
		System.out.println(bOutput);
		
		// 배열 Arrays메소드 toString()을 사용하여 각각 입력 값과 출력 값을 출력
		System.out.println(Arrays.toString(b));	
		System.out.println(Arrays.toString(bOutput.toByteArray()));
	}

}
