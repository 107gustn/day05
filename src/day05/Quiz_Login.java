package day05;

import java.util.Scanner;

public class Quiz_Login {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, wNum = 0;
		String uId = null, uPw = null, cId, cPw;
		
		while(wNum < 1) {
			
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. ������");
			System.out.print(">>> ");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("���̵� �Է� : ");
				cId = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				cPw = sc.next();
				if(cId.equals(uId) && cPw.equals(uPw)) {
					System.out.println("���� ���� !!!");
				}else {
					System.out.println("��������");
				}
				break;
			case 2:
				System.out.print("������ ���̵� �Է� : ");
				uId = sc.next();
				System.out.print("������ ��й�ȣ �Է� : ");
				uPw = sc.next();
				if(uId != null && uPw != null) {
					System.out.println("���� �Ϸ� !!!");
				}
				break;
			case 3:
				System.out.println("���α׷��� ���� �մϴ�!!!");
				wNum++;
				break;
			default:
				System.out.println("�ٽ� �Է��ϼ���.");
			}
			
		}
	}

}
