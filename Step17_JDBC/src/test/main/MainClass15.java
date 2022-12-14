package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass15 {
	public static void main(String[] args) {
		/*
		 * 	Scanner 객체를 이용해서 추가할 회원의 이름과 주소를 각각 입력받아서
		 * 	MemberDto 객체에 담고
		 * 	MemberDao 객체를 이용해서 DB 에 저장하는 프로그래밍을 해보세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("회원이름: ");
		String name = scan.nextLine();
		
		System.out.println("회원주소: ");
		String addr = scan.nextLine();
		
		//입력 받은 이름을 MemberDto 객체에 담고
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		//MemberDao 객체를 생성해서
		MemberDao dao = new MemberDao();
		
		//DB에 저장하고 성공여부를 리턴받는다.
		boolean isSuccess = dao.insert(dto);
		//성공여부에 따라 다른 동작을 한다.
		if(isSuccess) {
			System.out.println(name+" 의 정보를 추가 했습니다.");
		}else {
			System.out.println("회원정보 추가 실패!");
		}
	}
}
