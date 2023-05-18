package day15;

import java.util.Scanner;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3개의 과일 이름 입력받아 fruit에 저장
		//for-each문을 사용해 입력바든 과일 이름 출력
		Scanner sc= new Scanner(System.in);
		String fruits[]=new String[3];
		for(int i=0;i<3;i++) {
			System.out.print("주문할 과일 : ");
			fruits[i]=sc.next();
		}
		System.out.println("---주문받은 과일---");
		for(String x:fruits)
			System.out.println(x+" ");
	}

}
