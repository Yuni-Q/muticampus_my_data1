package test04;

import java.util.HashMap;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		HashMap<String, Student> map=new HashMap<>();
		
		//�ʿ� ������ �߰��ϱ� (Ű, ��ü)
		map.put("������", new Student("������", "010-7564-0626", 20, "���� ���빮�� ������"));
		map.put("���ڹ�", new Student("���ڹ�", "010-1111-2222", 20, "���� ������ ���̵�"));
		map.put("�ڻＺ", new Student("�ڻＺ", "010-2222-2222", 20, "���� ���ϱ� ������"));
		map.put("�ֿ���", new Student("�ֿ���", "010-9999-9999", 20, "���� ������ ������"));
	
		
		
		//�ʿ� �ִ� ������ �����ϱ�
		map.put("������", new Student("������", "010-7564-0626", 20, "���� ���빮�� ������"));
		
		map.remove("���ڹ�");
		
		//�ʿ� �ִ� ��ü ������ �ϳ��� ��������
		Set<String> keyset=map.keySet();
		for(String name : keyset){
			System.out.println(map.get(name));
		}
		
		
	}
}
