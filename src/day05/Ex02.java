package day05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		//while
		int i=0;
		
		//for( ; i<3 ; ) {
		while(i<3) { //(조건식) - 조건식이 참이면 종속문장 실행, 거짓이면 반복문을 빠져나옴.
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		i = 0;
		
		while(true) {//== for(;;) //종속문장을 계속 반복해준다.
			System.out.print("수 입력(1~100) : ");
			i = sc.nextInt();
			
			if(i >= 1 && i <= 100)
				break; //반복문을 빠져나옴
			System.out.println("잘못 입력. 다시");
		}
		
		for(int j=1; j<=i; j++)
			sum += j;
		System.out.println("입력 받은 수까지의 합 : " + sum);
		System.out.println();
		
		
		//1 ~ 10 사이의 숫자만 입력받아 1부터 입력 받은 수까지의 합을 구하시오.
		int num = 0;
		sum = 0;
		while(true) {
			System.out.print("1 ~ 10 사이의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num >= 1 && num <= 10) {
				break;
			}
			System.out.println("다시 입력 해주세요.");
		}
		
		for(i = 1 ; i <= num ; i++) {
			sum += i;
		}
		System.out.println("1부터 입력받은 수까지의 합 : " + sum);
		System.out.println();
		
		
		//10 ~ 20 사이의 숫자만 입력받아 1부터 입력 받은 수까지의 합을 구하시오.
		sum=0;
		while(true) {
			System.out.print("10 ~ 20 사이의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num >= 10 && num <= 20) {
				break;
			}
			System.out.println("다시 입력 해주세요.");
		}
		
		for(i = 1 ; i <= num ; i++) {
			sum += i;
		}
		System.out.println("1부터 입력받은 수까지의 합 : " + sum);
		System.out.println();
		
		
		//두 수를 입력 받아 입력받은 수 사이의 합을 구하세요.
		//입력 값 : 1, 10 -> 55. 10, 1 -> 55

		int num1, num2;
		System.out.print("두 수 입력 : ");
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
//		System.out.println("합 : " + sum);
		
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
		System.out.println("합 : " + sum);

		
	}
	
}
