package baekjoon_java_15000_19999;

import java.util.Scanner;

public class Baekjoon_17362 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		sc.close();
		if (a % 8 == 1) {
			System.out.println(1);
		}
		else if(a % 8 == 2 || a % 8 == 0) {
			System.out.println(2);
		}
		else if(a % 8 == 3 || a % 8 == 7) {
			System.out.println(3);
		}
		else if(a % 8 ==4 || a % 8 ==6) {
			System.out.println(4);
		}
		else {
			System.out.println(5);
		}
	}
}
