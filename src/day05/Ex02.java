package day05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		//while
		int i=0;
		
		//for( ; i<3 ; ) {
		while(i<3) { //(���ǽ�) - ���ǽ��� ���̸� ���ӹ��� ����, �����̸� �ݺ����� ��������.
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		i = 0;
		
		while(true) {//== for(;;) //���ӹ����� ��� �ݺ����ش�.
			System.out.print("�� �Է�(1~100) : ");
			i = sc.nextInt();
			
			if(i >= 1 && i <= 100)
				break; //�ݺ����� ��������
			System.out.println("�߸� �Է�. �ٽ�");
		}
		
		for(int j=1; j<=i; j++)
			sum += j;
		System.out.println("�Է� ���� �������� �� : " + sum);
		System.out.println();
		
		
		//1 ~ 10 ������ ���ڸ� �Է¹޾� 1���� �Է� ���� �������� ���� ���Ͻÿ�.
		int num = 0;
		sum = 0;
		while(true) {
			System.out.print("1 ~ 10 ������ ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			
			if(num >= 1 && num <= 10) {
				break;
			}
			System.out.println("�ٽ� �Է� ���ּ���.");
		}
		
		for(i = 1 ; i <= num ; i++) {
			sum += i;
		}
		System.out.println("1���� �Է¹��� �������� �� : " + sum);
		System.out.println();
		
		
		//10 ~ 20 ������ ���ڸ� �Է¹޾� 1���� �Է� ���� �������� ���� ���Ͻÿ�.
		sum=0;
		while(true) {
			System.out.print("10 ~ 20 ������ ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			
			if(num >= 10 && num <= 20) {
				break;
			}
			System.out.println("�ٽ� �Է� ���ּ���.");
		}
		
		for(i = 1 ; i <= num ; i++) {
			sum += i;
		}
		System.out.println("1���� �Է¹��� �������� �� : " + sum);
		System.out.println();
		
		
		//�� ���� �Է� �޾� �Է¹��� �� ������ ���� ���ϼ���.
		//�Է� �� : 1, 10 -> 55. 10, 1 -> 55

		int num1, num2;
		System.out.print("�� �� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//1
//		sum = 0;
//		int n1 = num1;
//		
//		while(n1 <= num2) {
//			sum += n1;
//			n1++;
//		}
//		while(num2 <= num1) {
//			sum += num2;
//			num2++;
//		}
//		System.out.println("�� : " + sum);
		
		//2
		sum=0;
		int max=0, min=0;
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		while(min <= max) {
			sum+=min;
			min++;
		}
		System.out.println("�� : " + sum);

		
	}
	
}
