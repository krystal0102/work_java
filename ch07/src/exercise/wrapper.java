package exercise;

public class wrapper {
	
	Byte B = 127;
	Short S = 32767;
	Integer I = 10;
	Long L = 32000L;
	Float F = 1.4F;
	Double D = 3.5;
	Character C = '@'; 
	Boolean Bool = true;
	
	public void printf() {
		System.out.printf("%d\n + %d\n + %d\n + %d\n + %f\n + %f\n + %c\n + %b\n", B, S, I, L, F, D, C, Bool);
	}
	
	
	public static void main(String[] args) {
		
	}
	
	
}
