package generics;

public class MyGenerics {
	
	// method에 generic을 붙여 사용할 땐 메소드명 앞에 입력하면 된다
	public static <T> T get (T[] ary, int index) {
		return ary[index];	// 어레이의 타입에 따라 <T>가 결절됨
	}
	
	public static <T> T getLast (T[] ary) {
		return ary[ary.length-1];
	}
	
	public static void main(String[] args) {
		Integer[] n = {3,4,5,7};
		System.out.println(MyGenerics.get(n, 2) +" "+ MyGenerics.getLast(n));
		String[] s = {"generics", "type casting", "input", "output"};
		System.out.println(MyGenerics.get(s, 1) +" "+ MyGenerics.getLast(s));
	}

}
