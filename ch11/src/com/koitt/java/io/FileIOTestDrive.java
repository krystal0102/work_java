package com.koitt.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTestDrive {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("music.mp3");
			fos = new FileOutputStream("music-copy.mp3");

			long startTime = System.currentTimeMillis();		// 현재 시간을 밀리초단위 시작시간으로 시작
			System.out.println("복사 시작 ====================");

			int data = 0;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}	

			long endTime = System.currentTimeMillis();
			System.out.println("복사 종료 ====================");

			System.out.println("복사 소요 시간: " + (endTime - startTime) + "ms");

			fos.close();
			fis.close();


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
