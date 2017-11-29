package test04;

import java.util.HashMap;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		HashMap<String, Student> map=new HashMap<>();
		
		//맵에 데이터 추가하기 (키, 객체)
		map.put("양유진", new Student("양유진", "010-7564-0626", 20, "서울 서대문구 충정로"));
		map.put("김자바", new Student("김자바", "010-1111-2222", 20, "서울 마포구 신촌동"));
		map.put("박삼성", new Student("박삼성", "010-2222-2222", 20, "서울 성북구 정릉동"));
		map.put("최엘지", new Student("최엘지", "010-9999-9999", 20, "서울 강남구 강남로"));
	
		
		
		//맵에 있는 데이터 수정하기
		map.put("양유진", new Student("양유진", "010-7564-0626", 20, "서울 서대문구 충정로"));
		
		map.remove("김자바");
		
		//맵에 있는 전체 데이터 하나씩 꺼내보기
		Set<String> keyset=map.keySet();
		for(String name : keyset){
			System.out.println(map.get(name));
		}
		
		
	}
}
