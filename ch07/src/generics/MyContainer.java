package generics;

import java.util.ArrayList;

public class MyContainer<E> {
	private ArrayList<E> list;
	
	public MyContainer() {
		list = new ArrayList<E>();
	}
	
	public E get(int index) {
		return list.get(index);
	}
	
	public void add(E element) {
		list.add(element); 
	}
	
	public static void main(String[] args) {
		MyContainer<String> pl = new MyContainer<String>(); // 메인메소드에서 generic을 String으로 지정함으로써 위의 <E>는 String이 됨
		pl.add("algol");
		pl.add("C");
		// pl.add(5);
		pl.add("java");
		System.out.println(pl.get(0) + " ");	// ArrayList를 이용하니까 배열
		System.out.println(pl.get(1) + " ");
		System.out.println(pl.get(2) + " ");
		
		MyContainer<Integer> p2 = new MyContainer<Integer>(); // 여기선 Integer만 쓸수 있겠지
		p2.add(20);
		p2.add(10);
		System.out.println(pl.get(0) + " ");
		System.out.println(p2.get(1) + " ");
	}

}
