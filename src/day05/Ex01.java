package day05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
	 	for - �ݺ���
	 	- ��Ģ������ ���� ���Ѵٸ� �ݺ����� ����� �� �ִ�.
		*/
		int sum = 0, i = 0;
		
		//(�ʱⰪ ; ���ǽ� ; ������)
		//�ʱⰪ -> ���ǽ� -> ���ӹ��� -> ������ -> ���ǽ� -> ���ӹ��� -> ������ -> ���ǽ� -> �������� ������ �����Ѵ�.
		for(i = 1 ; i <= 10 ; i++ ) {
			System.out.println( i ); //���ӹ���
			sum = sum + i;
		}
		
		System.out.println("i : " + i);
		System.out.println("sum : " + sum);
			
			
		/*
		i++; sum = sum + i;
		i++; sum = sum + i;
		i++; sum = sum + i;
		i++; sum = sum + i;
		i++; sum = sum + i;
		i++; sum = sum + i;
		i++; sum = sum + i;
		i++; sum = sum + i;
		i++; sum = sum + i;
		i++; sum = sum + i;
		
		System.out.println("sum : " + sum);
		*/
		
		
		for(int k = 1; k <= 10 ; k += 2) {
			System.out.println("k : " + k);
		}
		System.out.println("==========");
		for(int k = 1 ; k <= 10 ; k++) {
			if(k%2 == 1) {
				System.out.println("k : " + k);
			}
		}
		System.out.println();
		
		
		//����ڷκ��� �Է¹��� �������� ¦, Ȧ, ������ ���ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		int num, evenSum = 0, oddSum = 0, allSum = 0;
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		num = sc.nextInt();
		
		for(int k = 1 ; k <= num ; k++) {
//			System.out.println("k : " + k);
			if(k%2 == 0) {
				evenSum += k;
			}else {
				oddSum += k;
			}
			allSum += k;
		}
		System.out.println("allSum : " + allSum);//�� ��
		System.out.println("evenSum : " + evenSum);//¦���� ��
		System.out.println("oddSum : " + oddSum);//Ȧ���� ��
		System.out.println();
		
		
		i=0;
		for( ; i<3 ; ) {//���� ������ ���ѹݺ� �Ѵ�.
			System.out.println("test");
			i++;
		}
	}

}
