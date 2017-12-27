package operator;

public class BitLogicalOP {

	public static void main(String[] args) {
		
		/*1byte = 8bit
		 * 1byte = 4byte
		 *따라서 int 4 = 32bit
		 *4를 이진수로 표현하면 100(2)
		 */
		
		int x = 4, y = 7;
		
		System.out.format("%x & %8x -> %-8x %n", x, -1, x & -1);
		System.out.format("%x & %8x -> %-8x %n", y, -1, y & -1);
		System.out.format("%x | %-8x -> %-8x %n", x, 0, x | 0);
		System.out.format("%x | %-8x -> %-8x %n", y, 0, y | 0);
		System.out.format("(%x ^ 1) ^ 1 -> %1$-4d %n", x, (x ^ 1)^1);
		System.out.format("%1$-8x %1$-4d %n", (~x) + 1);
		System.out.format("%1$-8x %1$-4d %n", (~y) + 1);
	}

}
