package chap07.sec03.exam01_parent_constructor_call;

/* 자식 클래스 */
public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}

