package day05;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
		break : �ݺ���, switch���� �������ö� ����Ѵ�.
		continue : �ݺ����� �������� �÷������ش�. 
		 */
		
		for(int i=0 ; i<5 ; i++) {
			if(i==3) {
				System.out.println("if����");
				//continue; //�ݺ��� �ȿ��� ����Ѵ�. //�ݺ����� �� �������� �����ش�.
				break; //�ݺ����� ��������
			}
			System.out.println("i : " + i);
		}
		System.out.println();
		
		int n1 = 10, n2 = 10;
		if(n1 == n2) {
			System.out.println("�� ���� ����");
		}
		
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		s1 = sc.next();
		System.out.print("���� �Է� : ");
		s2 = sc.next();
		if( s1.equals(s2) ) { //(s1 == s2) { //���ڿ��� ���ҋ� equals() �� ����Ѵ�.
			System.out.println("�� ���ڴ� ����.");
		}
		System.out.println( s1.equals(s2) );
		
		
	}
}
