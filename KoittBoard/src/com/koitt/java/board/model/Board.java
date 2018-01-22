package com.koitt.java.board.model;

import java.io.Serializable;
import java.util.Date;

// Java Bean 만들기
public class Board implements Serializable {
	private Integer id;		// 글 번호 // Integer 기본값 null -> if문 이용시  null값을 체크할 수 있음
			// int 기본값0 -> 입력을 안받았을때 비어있는 값을 따로 지정해야함
	private String title;	// 글 제목
	private String content;	// 글 내용
	private String writer;	// 작성자
	private Date regDate;	// 글 생성일
	
	// 1.
	private Date modiDate;	// 글 수정일 
	
	// 1. 기본 생성자
	public Board() {}

	// 2. 생성자 (모든 필드 초기화)														// 2.
	public Board(Integer id, String title, String content, String writer, Date regDate, Date modiDate) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
		
		// 3.
		this.modiDate = modiDate;
	}

	// 3. getter, setter
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
	
	// 4.
	public Date getModiDate() {
		return modiDate;
	}

	public void setModiDate(Date modiDate) {
		this.modiDate = modiDate;
	}

	// 4. hashCode
	@Override
	public int hashCode() {
		return this.id.hashCode() + this.content.hashCode() + this.title.hashCode() + 
				this.writer.hashCode() + this.regDate.hashCode() + /* 5. */this.modiDate.hashCode();
	}
	
	// 5. equals
	@Override
	public boolean equals(Object obj) {
		
		// 5-1. 객체 주소 비교
		if (this == obj) {
			return true;
		}
		
		// 5-2. Argument가 Board를 상속받았는지 검사
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
	
	// 6. toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("게시판 [");
		builder.append(id);
		builder.append("] 제목: ");
		builder.append(title);
		builder.append(" / 내용: ");
		builder.append(content);
		builder.append(" / 작성자: ");
		builder.append(writer);
		builder.append(" / 작성일: ");
		builder.append(regDate);
		builder.append(" / 수정일: ");
		builder.append(modiDate);
		return builder.toString();
	}	
}