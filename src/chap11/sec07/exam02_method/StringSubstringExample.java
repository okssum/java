package chap11.sec07.exam02_method;

/* 문자열 추출하기 */
public class StringSubstringExample {
	public static void main(String[] args) {	
		String ssn = "880815-1234567 ";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);		
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	} 
}

