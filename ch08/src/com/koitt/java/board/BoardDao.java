package com.koitt.java.board;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	List<Board> list;
	
	public BoardDao() {
		this.list = new ArrayList<Board>();
	}
	
	public void insert(Board b) throws BoardException {
		
		for (Board item : this.list) {
			
			if (item.equals(b)) {
				throw new BoardException("E01 : Board 객체 중복");
			}
		}
		this.list.add(b);
	}
	
	public List<Board> selectAll() {
		return this.list;
	}
	
	public void delete(Board b) throws BoardException {
		for (int i = 0; i < this.list.size(); i++ ) {
			if (this.list.get(i).equals(b)) {
				this.list.remove(i);
				return;
			}
		}
		throw new BoardException("E02 : 삭제할 게시글이 없습니다.");
	}
	
	public void update(Board b) throws BoardException {
		
		for (Board item : this.list) {
			if (item.equals(b)) {
				item.setTitle(b.getTitle());
				item.setContent(b.getContent());
				item.setWriter(b.getWriter());
				return;
			}
		}
		throw new BoardException("E03: 수정할 게시글이 없습니다.");
	}
	
}
