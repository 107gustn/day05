package day05;

import java.util.Scanner;

public class Quiz_Machine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int mMoney, wNum = 0, sNum;
		int coffee=200, cocoa=250;
		
		System.out.print("요금을 투입 하세요 >>> ");
		mMoney = sc.nextInt();
		
		while(wNum < 1) {
			System.out.println("==========커피 자판기==========\n");
			System.out.println("1. 커피(200)\t2. 코코아(500)\t3. 반환\t4. 종료");
			System.out.print("메뉴를 선택하세요 >>> ");
			sNum = sc.nextInt();
			
			switch(sNum) {
			case 1:
				if(mMoney >= 200) {
					System.out.println("맛있게 드세요.");
					mMoney = mMoney - coffee;
				}else {
					System.out.println("요금이 부족합니다.");
				}
				break;
			case 2:
				if(mMoney >= 250) {
					System.out.println("맛있게 드세요.");
					mMoney = mMoney - cocoa;
				}else {
					System.out.println("요금이 부족합니다.");
				}
				break;
			case 3:
				System.out.println("거스름돈 : " + mMoney);
				mMoney = 0;
				break;
			case 4:
				System.out.println("프로그램 종료!!!");
				wNum++;
				break;
			default:
				System.out.println("다시 고르세요.");
			}
		}

	}

}
