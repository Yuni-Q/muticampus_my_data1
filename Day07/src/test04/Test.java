package test04;

public class Test {
	public static void main(String[] args) {
		String s = new String("Hello Java");

		String result = s.toUpperCase();// �빮��
		System.out.println(result);

		result = s.substring(6);// 6��° �ڸ����� ���
		System.out.println(result);

		result = s.substring(1, 3);// 1��°���� 3-1������ ���
		System.out.println(result);

		System.out.println(s.charAt(6));// 6��° ���� ���

		System.out.println(s.length());// ���� ���

		System.out.println(s.indexOf('a'));// a�� ���°�� �ִ���

		System.out.println(s.equals("Hello java"));// ��

		System.out.println(s.equalsIgnoreCase("hello java"));// ��ҹ��� �����ϰ� ��

		System.out.println(s.replace("Java", "JSP"));// �ٲٱ�
		
		System.out.println(s);//���
	}
}
