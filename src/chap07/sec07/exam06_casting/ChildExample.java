package chap07.sec07.exam06_casting;

/* 강제 타입 변환(캐스팅) */
public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		parent.field2 = "data2";  //(불가능)
		parent.method3();         //(불가능)
		*/
		
		Child child = (Child) parent;
		child.field2 = "yyy";  //(가능)
		child.method3();     //(가능)
	}
}
