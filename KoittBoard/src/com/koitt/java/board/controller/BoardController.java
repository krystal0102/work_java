package com.koitt.java.board.controller;

import java.util.Scanner;

import com.koitt.java.board.service.BoardService;

public class BoardController {
	
	private BoardService service;
	
	public static void main(String[] args) {
		
		BoardController controller = new BoardController();
		Scanner input = new Scanner(System.in);
		
		System.out.println("--------------- KOITT 게시판 ---------------");
		System.out.println("1. 게시글 추가");
		System.out.println("2. 게시글 전체 목록 출력");
		System.out.println("3. 게시글 삭제");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴번호 입력 >> ");
	}

}
