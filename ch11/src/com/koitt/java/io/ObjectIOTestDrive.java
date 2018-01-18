package com.koitt.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// 객체 입출력을 테스트해보자
public class ObjectIOTestDrive {
	public static void main(String[] args) {
		// 파일에 저장할 객체 생성
		Person p1 = new Person("홍길동", "서울", 30);
		Person p2 = new Person("홍길순", "부산", 28);
		Person p3 = new Person("홍길자", "전주", 35);

		// 1. Connection Stream, Chain Stream 생성 ( try -catch 구문때문에 빼놓음)
		ObjectOutputStream oos = null;	// Chain Stream : 실제 객체를 직렬화시켜서 옮기는 역할
		FileOutputStream fos = null;	// Cennection Stream : 총의 소음기와 같은 역할..? 보조역할

		try {
			// person.dat 파일을 Destination으로 
			fos = new FileOutputStream("person.dat");	
			oos = new ObjectOutputStream(fos);

			// Connection Stream을 이용해서 객체를 띄워올려서 파일까지 옮겨줌
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			oos.writeObject(null); // 파일에게 객체가 더 이상 없다는것을 알려줌.  null이 들어오면 더 이상 객체가 없겠구나~

			// writeObject 메소드가 ObjectOutputStream과 FileOutputStream을 거쳐 person.dat까지 객체를 보낸다.

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("객체 정보를 파일에 저장완료했습니다.");

		//	************************************************************************************
		// 파일을 읽어서 객체 정보를 나타내보자
		
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
						// 파일을 불러온다
			fis = new FileInputStream("person.dat");
						// Object에 fis를 싣기
			ois = new ObjectInputStream(fis);

			Object item = null;
							// 가져온 파일을 read로 읽기
			while ((item = ois.readObject()) != null) {
				System.out.println(item);

			} 

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
