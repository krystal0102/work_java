package com.koitt.java.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.koitt.java.board.model.Board;

// 파일 입출력에 관한 기능들을 BoardDao에서 분리하여 따로 마련해줬다
// 파일 관련 기능은 어디든지 쓸 수 있으니까

public class FileManager {

	/*		TODO 1. private void saveToFile(List<Board> list, String filename)
	list : BoardDao에 있는 list필드
	filename : list 객체를 저장할 파일 이름*/

	public static void saveToFile(List<Board> list, String filename) {

		ObjectOutputStream oos = null;
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(filename);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(list);

			oos.close();
			fos.close();

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/*		TODO 2. private List<Board> loadFromFile(String filename)
	filename : 게시글 리스트가 저장된 파일명*/

	public static<T> List<Board> loadFromFile (String filename) {

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object list = null; 

		try { 

			File file = new File(filename);

			if (file.exists()) {

				fis = new FileInputStream(filename);
				ois = new ObjectInputStream(fis);

				list =  ois.readObject();

				ois.close();
				fis.close();

				return(List<Board>) list;

				/*	List<Board> : 파일에서 불러온 list 객체를 리턴*/

			}
			else {
				System.out.println("아직 게시글을 작성하지 않았어요ㅠㅠ");
				System.out.println();
				return new ArrayList<Board>();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 

		return null;
	}

}
