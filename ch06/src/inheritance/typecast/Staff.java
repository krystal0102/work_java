package inheritance.typecast;

public class Staff extends Faculty {
	
	public String division;
	
	public Staff(String name, long number, String univ, long idNumber) {
		
		super(name, number, univ, idNumber); 
		// 위 문장이 없을경우 자동으로 super()를 호출하는데 Faculty엔 기본생성자가 없으므로 오류 발생할것임
		
	}
	

}
