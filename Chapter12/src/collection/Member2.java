package collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2> {
	private int memberId; //id
	private String memberName; //ȸ�� �̸�
	
	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}

	@Override
	public int hashCode() { //hashCode() �޼��尡 ȸ�� ���̵� ��ȯ�ϵ��� ������
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member2 member = (Member2)obj;
			
			if(this.memberId == member.memberId)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int compare(Member2 mem1, Member2 mem2) { //compare() �޼��� ������, ���޹��� �� �Ű������� ����
		return mem1.getMemberId() - mem2.getMemberId();
	}
}