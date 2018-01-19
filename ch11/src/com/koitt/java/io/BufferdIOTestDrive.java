package com.koitt.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdIOTestDrive {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		

		try {
			fis = new FileInputStream("music.mp3");
			fos = new FileOutputStream("music-copy.mp3");
			bis = new BufferedInputStream(fis);			// Chain Stream을 추가함
			bos = new BufferedOutputStream(fos);

			long startTime = System.currentTimeMillis();		// 현재 시간을 밀리초단위 시작시간으로 시작
			System.out.println("복사 시작 ====================");

			byte[] buffer = new byte[100]; 			// 파일을 100 바이트씩 읽어오게할거임
			while (bis.read(buffer) != -1) {		
				bos.write(buffer);
			}	

			long endTime = System.currentTimeMillis();
			System.out.println("복사 종료 ===================");

			System.out.println("복사 소요 시간: " + (endTime - startTime) + "ms");

			
			bos.close();
			bis.close();			// Chain 먼저 닫고
			fis.close();			// Connection 닫기
			fos.close();			
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
