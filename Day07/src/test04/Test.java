package test04;

public class Test {
	public static void main(String[] args) {
		String s = new String("Hello Java");

		String result = s.toUpperCase();// 대문자
		System.out.println(result);

		result = s.substring(6);// 6번째 자리부터 출력
		System.out.println(result);

		result = s.substring(1, 3);// 1번째부터 3-1번까지 출력
		System.out.println(result);

		System.out.println(s.charAt(6));// 6번째 글자 출력

		System.out.println(s.length());// 길이 출력

		System.out.println(s.indexOf('a'));// a가 몇번째에 있는지

		System.out.println(s.equals("Hello java"));// 비교

		System.out.println(s.equalsIgnoreCase("hello java"));// 대소문자 무시하고 비교

		System.out.println(s.replace("Java", "JSP"));// 바꾸기
		
		System.out.println(s);//출력
	}
}
