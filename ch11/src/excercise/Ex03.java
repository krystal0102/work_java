package excercise;

import java.io.File;

public class Ex03 {
public static void main(String[] args) {
		
	
		/*	강사님 풀이
		 * 
		 * 	// excercise 폴더를 객체화
		 *	File f = new File("src/excercise");
		 *
		 *	// excercise 폴더 내부의 파일 혹은 폴더 목록을 제공
			String[] list = f.list(); 
			
			for (int i = 0; i < list.length; i++) {
			
				String name = list[i];
				
				// excercise 폴더내의 파일 혹은 폴더를 객체화 
				File file = new File("src/excercise/" + name);
				
				// File 클래스의 API(메소드)를 이용해서 파일인지 폴더인지 구분
				 if (file.isDirectory()) {
				 	System.out.println("폴더: " + name);
				 }
				 else if (file.isFile()) {
				 	System.out.println("파일: " + name);
				 }
			
			}
			*/
	
		String fname = "src/excercise";
		File f = new File(fname);
		
		File[] fList = f.listFiles();

		System.out.println("현재폴더: " + f.getName()) ;
		System.out.println("상위폴더: " + f.getParent());
		System.out.println("폴더여부: " + f.isDirectory());
		System.out.println();
		
		for (int i = 0; i < fList.length; i++) {
			
			File file = fList[i];
			
			if(file.isFile()) {
				
				System.out.println("파일: " + file.getName());
				System.out.println();
				
			} else if(file.isDirectory()) {
				
				System.out.println("폴더: " + file.getName());
				System.out.println();
				
			}
		}
	}

}
