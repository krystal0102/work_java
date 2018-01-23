package excercise;

import java.io.File;
import java.util.Scanner;

public class Ex04 {
	
	public static final String PATH = "src/excercise/"; // 상세 경로를 상수로 지정하여 관리 편리하게 할 수 있음
									// "./" 은 나 자신 폴더의 아래에 생성
	
	public static void main(String[] args) {
		
		// 명령행에서 폴더명을 입력받아 File 객체화
		File f = new File( PATH + args[0]); 

		// 폴더생성 : 실제 폴더가 만들어졌는지 결과를 리턴
		// 이클립스에서 실행 : 프로젝트 최상위 폴더
		// cmd에서 실행 : 현재 실행한 폴더가 현재 폴더
		boolean isMake = f.mkdir();
		
		
		if (isMake) {
			System.out.println("폴더가 생성되었습니다.");
		}
		else {
			System.out.println("폴더 생성에 실패했습니다.");
		}
	
	}

}
