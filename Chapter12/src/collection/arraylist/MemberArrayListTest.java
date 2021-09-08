package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "이지원"); //새로운 회원 인스턴스 생성
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(memberLee); //ArrayList 에 회원 추가
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember(); //전체 회원 출력
		
		memberArrayList.removeMember(memberHong.getMemberId()); //hong remove
		memberArrayList.showAllMember(); //hong remove, and print all member
	}
}
