package chap06.sec11.exam01_final;

/* final 필드 선언과 초기화 */
public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

