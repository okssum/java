package chap11.sec05.exam05_getenv;

/* JAVA_HOME 환경 변수 값 얻기 */
public class SystemEnvExample {
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");		
		System.out.println("[ JAVA_HOME ]  " + javaHome);
	}
}
