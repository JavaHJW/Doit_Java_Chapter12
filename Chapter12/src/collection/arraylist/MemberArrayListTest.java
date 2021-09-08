package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "������"); //���ο� ȸ�� �ν��Ͻ� ����
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		memberArrayList.addMember(memberLee); //ArrayList �� ȸ�� �߰�
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember(); //��ü ȸ�� ���
		
		memberArrayList.removeMember(memberHong.getMemberId()); //hong remove
		memberArrayList.showAllMember(); //hong remove, and print all member
	}
}
