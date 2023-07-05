package baekjoon_java_10000_14999;

import java.util.Scanner;

public class Baekjoon_10179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for (int i = 0 ; i < cnt ; i++) {
			double price = sc.nextDouble();
			System.out.print("$");
			System.out.printf("%.2f\n",0.8*price);
		}
		sc.close();
	}
}
