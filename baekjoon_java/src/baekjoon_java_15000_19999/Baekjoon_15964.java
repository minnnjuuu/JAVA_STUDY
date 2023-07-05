package baekjoon_java_15000_19999;

import java.util.Scanner;

public class Baekjoon_15964 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();
		System.out.println((long)(Math.pow(a,2)-Math.pow(b, 2)));
	}
}
