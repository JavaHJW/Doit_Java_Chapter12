package collection.arraylist;

import java.util.ArrayList;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList; //����
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //Member ������ ������ ArrayList ����
	}
	
	public void addMember(Member member) { //ArrayList�� ȸ���� �߰��ϴ� �޼���
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) { //�ش� ���̵� ���� ȸ���� ã�� ������
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i); //get() �޼���� ȸ���� ���������� ������
			
			int tempId = member.getMemberId();
			if(tempId == memberId) { //ȸ�� ���̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(i); //�ش� ȸ���� ����
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�."); //�ݺ����� ���� ������ �ش� ���̵� ã�� ���Ѱ��
		return false;
	}
	
	public void showAllMember() { //��ü ȸ���� ����ϴ� �޼���
		for(Member member : arrayList) { 
			System.out.println(member);
		}
		System.out.println();
	}
	
}