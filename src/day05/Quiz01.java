package day05;

public class Quiz01 {

	public static void main(String[] args) {
		
		//1
		for(int i = 1 ; i < 5 ; i ++) {
			System.out.println(i + ". hello");
		}
		System.out.println();
		
		
		//2
		int sum = 0;
		for(int i=1 ; i<=100 ; i++) {
			sum += i;
			if(sum == 528) {
				System.out.println("sum : " + sum);
				System.out.println("i : " + i);
			}
		}
		System.out.println();
		
		
		//3
		for(int i=1 ; i<=25 ; i++) {
			System.out.print(i + "\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
		

	}

}
