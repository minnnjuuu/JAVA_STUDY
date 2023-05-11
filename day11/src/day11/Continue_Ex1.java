package day11;

import java.util.Scanner;

public class Continue_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자에게 숫자를 입력 받아, 입력 받은 숫자를 출력하는 프로그램
		//0 입력시 반복 종료, 음수 입력시 숫자 출력 않고 계속 반복 진행
		Scanner sc=new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("숫자 입력 : ");
			num=sc.nextInt();
			//num == 0 종료
			if(num == 0) {
				System.out.println("종료 !");
				break;
			}
			else if(num<0) {
				System.out.println("아래 명령 무시하고 다음 반복 진행!");
				continue;
			}
			System.out.println("num = "+num);
		}

	}

}
