package com.koitt.java.class01;

	public class Student extends Person {

		/* Animal과 Person의 필드값을 상속 받으므로 필드를 중복작성하지 않아도 됨.
		 *  단, Teacher는 상속받지 않으므로 티쳐 필드 사용할 수 없음
		 */
		
		private int studentId; 	// 학생증 번호
		private String major; 	// 전공
		private int grade;		// 학년
		
		public int getStudentId() {
			return this.studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		
		
		public String getMajor() {
			return this.major;
		}
		public void setMajor(String major) {
			this.major = major;
		}
	

		public int getGrade() {
			return this.grade;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}

}
