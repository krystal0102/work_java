package com.koitt.java.board;

import java.util.List;

public class BoardService {
	
	private Integer count = 1;
	private BoardDao dao;
	
	public BoardService() {
		this.dao = new BoardDao();
	}
	
	public void add(Board b) throws BoardException {
		b.setId(count++);
		dao.insert(b);
	}
	
	public List<Board> read() {
		return dao.selectAll();
	}
	
	public void remove(Board b) throws BoardException {
		dao.delete(b);
	}
	
	public void modify (Board b) throws BoardException {
		dao.update(b);
	}

}
