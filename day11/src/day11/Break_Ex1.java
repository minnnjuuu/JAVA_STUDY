package day11;

import java.util.Scanner;

public class Break_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자에게 숫자를 입력받아 입력 받은 값이 0 일때 반복을 멈추는 프로그램
		Scanner sc=new Scanner (System.in);
		int num;
		while(true) {
			System.out.print("숫자 입력 : ");
			num=sc.nextInt();
			if(num==0) {
				System.out.println("프로그램 반복 종료!");
				break;
			}
			System.out.println("입력값 : "+num);
		}

	}

}
