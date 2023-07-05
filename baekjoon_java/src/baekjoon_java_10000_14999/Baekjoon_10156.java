package baekjoon_java_10000_14999;

import java.util.Scanner;

public class Baekjoon_10156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		long k = sc.nextLong();
		long n = sc.nextLong();
		long m = sc.nextLong();
		long money = k*n-m;
		if(money<=0)
			System.out.println(0);
		else
			System.out.println(money);
		sc.close();		
	}
}
