package day10;

import java.util.*; //util 패키지에 있는 모든 클래스 가져와

public class Up_Down_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int num=random.nextInt(100)+1;
		int user=-1;
		while(user!=num) {
			System.out.println("숫자 입력 : ");
			user=sc.nextInt();
			//user==num
			if(user==num) {
				System.out.println("정답입니다!");
			}
			//user>num ->down
			else if(user>num) {
				System.out.println("DOWN!");
			}
			//user<num -> up
			else {
				System.out.println("UP!");
			}
		}

	}

}
