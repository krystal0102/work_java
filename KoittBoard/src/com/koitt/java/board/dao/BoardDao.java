package com.koitt.java.board.dao;

import java.util.List;

import com.koitt.java.board.model.Board;

public class BoardDao {
	
	// DB대신 게시글을 저장하는 용도
	private List<Board> list;
	
	public void insert(Board board) {
		list.add(board);
	}

}
