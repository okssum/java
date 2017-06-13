package chap11.sec11.exam01_arrays;

/* 배열 항목 정렬 */
public class Member implements Comparable<Member> {
	String name;
	Member(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
}
