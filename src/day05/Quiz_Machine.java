package day05;

import java.util.Scanner;

public class Quiz_Machine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int mMoney, wNum = 0, sNum;
		int coffee=200, cocoa=250;
		
		System.out.print("����� ���� �ϼ��� >>> ");
		mMoney = sc.nextInt();
		
		while(wNum < 1) {
			System.out.println("==========Ŀ�� ���Ǳ�==========\n");
			System.out.println("1. Ŀ��(200)\t2. ���ھ�(500)\t3. ��ȯ\t4. ����");
			System.out.print("�޴��� �����ϼ��� >>> ");
			sNum = sc.nextInt();
			
			switch(sNum) {
			case 1:
				if(mMoney >= 200) {
					System.out.println("���ְ� �弼��.");
					mMoney = mMoney - coffee;
				}else {
					System.out.println("����� �����մϴ�.");
				}
				break;
			case 2:
				if(mMoney >= 250) {
					System.out.println("���ְ� �弼��.");
					mMoney = mMoney - cocoa;
				}else {
					System.out.println("����� �����մϴ�.");
				}
				break;
			case 3:
				System.out.println("�Ž����� : " + mMoney);
				mMoney = 0;
				break;
			case 4:
				System.out.println("���α׷� ����!!!");
				wNum++;
				break;
			default:
				System.out.println("�ٽ� ������.");
			}
		}

	}

}
