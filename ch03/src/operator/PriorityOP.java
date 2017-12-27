package operator;

public class PriorityOP {

	public static void main(String[] args) {
		System.out.println( 3 + 4 >> 2 > 5); // 1 > 5 false
		System.out.println( (( 3 + 4) >> 2) > 5); // 1 > 5 false
		System.out.println(3*4 & 4-3 << 5); // 12 & 64 -> 1100(2) & 100000(2) -> 000000 °á°ú´Â 0
		System.out.println(3*4 & (4-3 << 5)); // 0
		System.out.println((3*4 & 4-3) < 5); // 1100(2) & 1(2) < 5 -> 0000 < 5 true
		System.out.println((1&0) != 1 && 3<<2 > 5); // 0 != 1 && 12 > 5 -> true && true -> true
	}

}
