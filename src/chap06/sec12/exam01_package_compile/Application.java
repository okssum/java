package chap06.sec12.exam01_package_compile;

/* 
 * 패키지가 선언된 클래스 컴파일 
 * 
 * 패키지 선언이 포함된 클래스를 명령 프롬프트에서 컴파일할 경우, 
 * 패키지 폴더가 자동으로 생성되려면 "javac -d 패키지가 생성될 경로"로 지정해 주어야 함
 * ex) javac -d . Application.java
 * 
 * 패키기 선언이 포함된 클래스의 java 명령어는 바이트 코드 파일(*.class)이 있는 폴더에서 사용하면 안됨
 * 패키지는 클래스의 일부분이므로 패키지가 시작하는 폴더에서 java 명령어를 사용해야 함
 */
public class Application {
	public static void main(String[] args) {
		System.out.println("애플리케이션을 실행합니다.");
	}
}

