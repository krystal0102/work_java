package com.koitt.java.board;

import java.util.Date;

public class Board {
	
	private int id;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	
	public Board(int id, String title, String content, String writer, Date regDate) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
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
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("게시판 [ 게시물 번호:");
		builder.append(id);
		builder.append(", 제목:");
		builder.append(title);
		builder.append(", 내용:");
		builder.append(content);
		builder.append(", 작성자:");
		builder.append(writer);
		builder.append(", 작성일:");
		builder.append(regDate);
		builder.append("]");
		return builder.toString();
	}
	
}
