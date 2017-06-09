package chap11.sec03.exam03_tostring;

/* 객체의 문자 정보(toString() 메소드) */
public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return company + ", " + os;
	}
}
