package chap16.sec01.stream_introdution;

/* 학생 클래스 */
public class Student {
	private String name;
	private int score;
	
	public Student (String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() { return name; }
	public int getScore() { return score; }
}
