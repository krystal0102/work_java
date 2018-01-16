package com.koitt.java.board;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardController {

	private BoardService service;

	private Scanner input;

	public BoardController() {

		this.service = new BoardService();

		this.input = new Scanner(System.in);
	}

	public static void main(String[] args) {

		BoardController controller =  new BoardController();
		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("======================== 게시글 작성 프로그램 =========================");
			System.out.println("1. 게시글 작성하기");
			System.out.println("2. 작성한 글 확인");
			System.out.println("3. 게시글 삭제");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴 번호 입력 >> ");

			int menu = -1;

			try {
				menu = Integer.parseInt(input.nextLine());
			}

			catch (NumberFormatException e) {
				System.out.println("메뉴는 숫자로만 입력해주세요");
				System.out.println();
				continue;
			}

			switch (menu) {
			case 1:
				controller.menuAdd();
				break;
			case 2:
				controller.menuRead();
				break;
			case 3:
				controller.menuRemove();
				break;
			case 4: 
				controller.menuModify();
				break;
				
			case 5:
				 System.out.println("프로그램 종료하겠습니다. 안녕히계세요~!~~!~!!~~~");
				 System.exit(0);
				 break;

			default:
				System.out.println("메뉴 번호를 잘못 입력하셨습니다.");
				System.out.println();

			}

		} 

	}

	public void menuAdd() {
		System.out.println("게시글 정보를 입력해주세요.");

		System.out.print("글 제목: ");
		String title = this.input.nextLine();

		System.out.print("글 내용: ");
		String content = this.input.nextLine();

		System.out.print("작성자: ");
		String writer = this.input.nextLine();


		Board b = new Board(0, title, content, writer, new Date());


		try {
			this.service.add(b);
			System.out.println("게시글 작성 완료~");
			System.out.println();
		}

		catch (BoardException e) {
			System.out.println(e.getMessage());
		}

	}


	public void menuRead() {

		System.out.println("========================== 게시글 전체 목록 ==========================");
		List<Board> list = this.service.read();

		for (Board item : list) {
			System.out.println(item);
			System.out.println();
		}

	}

	public void menuRemove() {
		System.out.println("===================== 삭제할 게시글 정보를 입력하세요 =====================");

		Integer id = 0; 

		while(true) {
			try {
				System.out.print("글 번호 >> ");
				id = Integer.parseInt(this.input.nextLine());
			}
			catch (NumberFormatException e) {
				System.out.println("글 번호는 숫자로만 입력해주세요");
				System.out.println();
				continue;
			}

			Board b = new Board(id,null,null,null,null);

			try{
				service.remove(b);
				System.out.println(b.getId() + "번 게시글이 삭제됐습니다.");
				System.out.println();
				break;
			}
			catch (BoardException e) {
				System.out.println(e.getMessage());
			}

		}

	}

	public void menuModify() {
		System.out.println("===================== 수정할 게시글 정보를 입력해주세요. =====================");
		Integer id = 0; 

		while (true) {
			try {
				System.out.print("글 번호 >> ");
				id = Integer.parseInt(this.input.nextLine());
			}
			catch (NumberFormatException e) {
				System.out.println("글 번호는 숫자로만 입력해주세요");
				System.out.println();
				continue;
			}

			System.out.print("글 제목: ");
			String title = this.input.nextLine();

			System.out.print("글 내용: ");
			String content = this.input.nextLine();

			System.out.print("작성자: ");
			String writer = this.input.nextLine();

			Board b = new Board(id ,title, content, writer, new Date());

			try {
				service.modify(b);
				System.out.println(b.getId() + "번 게시글이 수정되었습니다.");
				System.out.println();
				break;
			}
			catch (BoardException e) {
				System.out.println(e.getMessage());
			}

		}

	}

}
