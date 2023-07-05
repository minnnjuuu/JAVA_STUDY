package baekjoon_java_10000_14999;

import java.util.Scanner;

public class Baekjoon_10797 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int a = sc.nextInt();
		for (int x=0;x<5;x++) {
			int car_num = sc.nextInt();
			if (a==car_num) {
				cnt++;
			}
		}
		sc.close();
		System.out.println(cnt);

	}

}
