package com.koitt.java.board.model;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {
	
	// java bean 만들기
	private Integer id;			// 글 번호
	private String title;		// 글 제목
	private String content;		// 글 내용
	private String writer;		// 작성자
	private Date regDate;		// 글 생성일

	
	// 1. 기본 생성자
	public Board() {}
	
	// 2. 생성자 (모든 필드 초기화)
	public Board(Integer id, String title, String content, String writer, Date regDate) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}
	
	// 3. getter setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	// 4. hashCode
	@Override
	public int hashCode() {
		return this.id.hashCode() + this.title.hashCode() + this.content.hashCode() 
				+ this.writer.hashCode() + this.regDate.hashCode();
	}
	
	// 5. equals
	@Override
	public boolean equals(Object obj) {
		
		// 5-1. 객체 주소 비교
		if (this == obj) {
			return true;
		}
		
		// 5-2. Arument가 Board를 상속받았는지 검사
		if (!(obj instanceof Board)) {
			return false;
		}
		
		// 5-3. Argument 다운캐스팅
		Board b = (Board) obj;
		if (this.id.equals(b.id)) {
			return true;
		}
		return false;
		
	}
	
	

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("게시판 [");
		b.append(this.id);
		b.append("] 제목:");
		b.append(this.title);
		b.append(" / 내용:");
		b.append(this.content);
		b.append(" / 작성자:");
		b.append(this.writer);
		b.append(" / 작성일:");
		b.append(this.regDate);
		b.append(" ");
		String a = b.toString();
		return a;
	}
	
}
