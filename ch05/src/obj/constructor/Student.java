package obj.constructor;

public class Student /*extends Object*/ {
	
	public String name;
	
	// 생성자 Constructor
	// alt + shift + s 
	public Student(String name) {
		
		super();
		/*super는 student(나)의 부모(Object)
		Object의 기본 생성자를 호출
		생략되어있지만 컴파일러가 자동으로 붙임
		항상 자식클래스 생성자의 맨 앞줄에 위치한다.
		호출 순서는 절대적임. 무조건 부모 다음 자식~ */
		
		
		// name이라는 필드를 초기화하는 생성자
		this.name = name; // this를 붙여줘야 위의 필드 name와 같게 구분할 수 있음
	}

	public void print() {
		System.out.println("학생이름 : " + this.name);
	}
	
	public static void main(String[] args) {
		Student i = new Student("김민정"); // 생성자 호출
		System.out.println(i.name);
		i.print();
		
		/*Object 객체 생성 : 기본 생성자를 이용하여 생성
		해당 클래스에 생성자가 하나도 없다면 컴파일러가 자동으로 기본 생성자를 생성한다.*/
		Object test = new Object();
		
		// 이미 생성자 Student(String name)이 존재하기 때문에 컴파일러가 기본생성자를 생성하지 않아서 아래와 같이 호출이 불가능하다.
		// Student s1 = new Student();
		
	}

}
