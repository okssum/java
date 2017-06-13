package chap11.sec06.exam03_newinstance;

/* 발신 클래스 */
public class SendAction implements Action {
	@Override
	public void execute() {
		System.out.println("데이터를 보냅니다.");
	}
}
