package com.koitt.java.board;

import java.util.Date;

public class Board {
	
	private Integer id;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	
	public Board() {
		
	}
	
	public Board(Integer id, String title, String content, String writer, Date regDate) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}
	
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

	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Board)) {
			return false;
		}
		
		Board b = (Board) obj;
		if (this.id != b.id) {
			return false;
		}
		return true;
		
	}
	
	@Override
	public int hashCode() {
		return this.id.hashCode() + this.title.hashCode() + this.content.hashCode() 
				+ this.writer.hashCode() + this.regDate.hashCode();
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
