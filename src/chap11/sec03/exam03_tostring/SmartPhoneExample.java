package chap11.sec03.exam03_tostring;

/* 객체의 문자 정보(toString() 메소드) */
public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
	}
}
