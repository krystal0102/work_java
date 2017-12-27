package programming.basic;

public class HelloPrintf {

	public static void main(String[] args) {
		System.out.println("123456 123456 123456");
		System.out.println("--------------------");
		/* d : Decimal 10진수
		 * O : Octal 8진수
		 * h,x,H : Hexadecimal 16진수
		 * 1$ : 인자의 자릿수를 가리킴. 1$는 첫번째 인자~~~
		 */
		System.out.format("%6d %6o %6h %n", 10,10,10); // 6칸을 차지하겠다
		System.out.format("%-6d %-6o %-6x %n", 20, 20, 20); //-붙이면 좌측정령
		System.out.format("%+6d %6o %6H %n", 30, 30, 30); // 단위를 붙이기 ex> +,-
		System.out.format("%1$6d %1$6o %1$6h %n",128);
		
		//.a 는 소수점 몇번째자리까지 나타낼건지 표시하고, 반올림해서 나타낸다
		System.out.printf("%1$6.2f %1$6.3f %1$6.4f %n", 3.141592);
		

	}

}
