package operator;

public class BitShiftOP {

	public static void main(String[] args) {
		
		int x = 8, y = 3;
																 //이진수 문자열로 바꿔준다!
		System.out.format("%d(%s) >> %d 결과 %d(%s) %n",x, Integer.toBinaryString(x),
				y, x>>3, Integer.toBinaryString(x>>3));
		// x값 8을 이진수로 바꿨을때는 1000임 >>3를 이용해 오른쪽으로 세번 이동하면 0001(2) = 1
		
		
		System.out.format("%d(%s) << %d 결과 %d(%s) %n",x, Integer.toBinaryString(x),
				y, x<<3, Integer.toBinaryString(x<<3));
		
		System.out.format("%d(%s) >>> %d 결과 %d(%s) %n",x, Integer.toBinaryString(x),
				y, x>>>3, Integer.toBinaryString(x>>>3));

	}

}
