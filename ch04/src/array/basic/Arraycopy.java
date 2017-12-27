package array.basic;

public class Arraycopy {

	public static void main(String[] args) {
		
		int[] copyFrom = {1, 2, 3, 4, 5, 6, 7};
		
		int[] copyTo = {10, 20, 30, 40, 50, 60, 70, 80};
		
		/*System.arraycopy(src, srcPos, dest, destPos, length);
		 * src : 근원지
		 * srcPosition : 어디서부터 쓸거냐. 소스의 위치
		 * destination : 어디에 붙일거냐, 목적지
		 * destpos : 목적지 중 어디서부터
		 * length : 소스에서 몇칸까지 쓸거냐 -> 예제의 경우 배열[4]에서 3칸까지 쓸거니까 5,6,7
 		 */
		System.arraycopy(copyFrom, 4, copyTo, 1, 3);
		
		
		
		for (int i = 0; i < copyFrom.length; i++)
			System.out.print(copyFrom[i] + " ");
		System.out.println();
		
		//for-each문. 순차적으로 참조할 때만 사용함
		for (int value : copyTo) 
			System.out.print(value + " ");

	}

}
