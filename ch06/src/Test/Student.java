package Test;

import java.util.Scanner;

public class Student extends Person {
	
	String univ;
	String dept;
	String studentId;
	double[] avgScore;
	
				// <----  상위 클래스에 존재하는 생성자  ----> //		
	public Student(String name, int age, String address,String univ, String dept, String studentId) {
		super(name, age, address);
		this.univ = univ;
		this.dept = dept;
		this.studentId = studentId;
		this.avgScore = new double[8];
	}
	
	public double average() {
		double sum = 0;
		for (int i = 0; i < avgScore.length; i++ ) {
			sum += avgScore[i];
		}
		return sum / avgScore.length;
	}
	
	public static void main(String[] args) {
		
		Student dajung = new Student("김다정", 20, "서울시 관악구","동양서울대학교", "전산정보학과", "20132222");
		
		System.out.println("이름: " + dajung.name);
		System.out.println("나이: " + dajung.age);
		System.out.println("주소: " + dajung.address);
		System.out.println("학교: " + dajung.univ);
		System.out.println("학과: " + dajung.dept);
		System.out.println("학번: " + dajung.studentId);
		
		System.out.println("-------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("8학기 학점을 순서대로 입력하세요.");
		
		for (int i = 0; i < dajung.avgScore.length; i++) {
		System.out.println((i+1) +"1학기 학점 -> ");	// 0부터 시작하니까 1을 더해준것
		dajung.avgScore[i] = scanner.nextDouble();
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println(dajung.avgScore.length+"학기 총 평균 평점은 "+dajung.average()+"입니다.");
	}
	
	

}
