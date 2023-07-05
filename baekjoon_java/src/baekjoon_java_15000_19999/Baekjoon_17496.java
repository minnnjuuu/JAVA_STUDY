package baekjoon_java_15000_19999;

import java.util.Scanner;

public class Baekjoon_17496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int c = sc.nextInt();
		int p = sc.nextInt();
		sc.close();
		long m = ((n-1)/t)*c*p;
		System.out.println(m);
	}
}
