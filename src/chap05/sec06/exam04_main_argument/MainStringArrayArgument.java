package chap05.sec06.exam04_main_argument;

/* main() 메소드의 매개 변수 
 * 
 * 사용법
 * 이클립스 - [Run] → [Run Configurations] → [Arguments] → [Program arguments] 에 "10 20" 입력 → [Run]
 * 명렴 프롬프트 - "java MainStringArrayArgument 10 20" 입력
 */
public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length != 2) { // 2개의 문자열을 주지 않으면 프로그램의 사요업을 출력하고 강제 종료 시키기
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
