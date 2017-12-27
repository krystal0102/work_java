package control.ifcondition;

public class Weatherif {

	public static void main(String[] args) {
		int degree = 30;
		
		//중괄호를 안쓰면 if다음의 첫줄만 if문에 포함시킴. But 내용이 길어질 경우 혼동하기 쉬우므로 {}쓰는걸 추천
		if (30 <= degree); {
			System.out.println("날씨가 덥습니다.");
		}	
			
		System.out.println("날씨 예보였습니다.");

	}

}
