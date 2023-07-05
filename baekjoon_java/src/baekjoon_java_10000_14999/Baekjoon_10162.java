package baekjoon_java_10000_14999;

import java.util.Scanner;

public class Baekjoon_10162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long T = sc.nextLong();
		sc.close();
		if (T%10 != 0) {
			System.out.println(-1);
		}
		else {
			long a = T / 300;
			long b = (T % 300)/60;
			long c = (T %60)/10;
			System.out.print(a);
			System.out.print(" ");
			System.out.print(b);
			System.out.print(" ");
			System.out.print(c);
		}
	}
}
