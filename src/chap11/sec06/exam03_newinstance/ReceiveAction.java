package chap11.sec06.exam03_newinstance;

/* 수신 클래스 */
public class ReceiveAction implements Action {
	@Override
	public void execute() {
		System.out.println("데이터를 받습니다.");		
	}
}
