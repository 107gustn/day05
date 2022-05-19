package day05;

import java.util.Scanner;

public class Quiz_Login {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, wNum = 0;
		String uId = null, uPw = null, cId, cPw;
		
		while(wNum < 1) {
			
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 나가기");
			System.out.print(">>> ");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("아이디 입력 : ");
				cId = sc.next();
				System.out.print("비밀번호 입력 : ");
				cPw = sc.next();
				if(cId.equals(uId) && cPw.equals(uPw)) {
					System.out.println("인증 성공 !!!");
				}else {
					System.out.println("인증실패");
				}
				break;
			case 2:
				System.out.print("저장할 아이디 입력 : ");
				uId = sc.next();
				System.out.print("저장할 비밀번호 입력 : ");
				uPw = sc.next();
				if(uId != null && uPw != null) {
					System.out.println("가입 완료 !!!");
				}
				break;
			case 3:
				System.out.println("프로그램을 종료 합니다!!!");
				wNum++;
				break;
			default:
				System.out.println("다시 입력하세요.");
			}
			
		}
	}

}
