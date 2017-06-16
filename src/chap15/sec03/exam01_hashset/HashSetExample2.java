package chap15.sec03.exam01_hashset;

import java.util.*;

/* Member 객체를 중복없이 저장하는 HashSet */
public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수 : " + set.size());
	}
}

