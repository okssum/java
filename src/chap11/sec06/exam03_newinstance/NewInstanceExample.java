package chap11.sec06.exam03_newinstance;

/* 동적 객체 생성 및 실행 */
public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("chap11.sec06.exam03_newinstance.SendAction");
			//Class clazz = Class.forName("chap11.sec06.exam03_newinstance.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}


