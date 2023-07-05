package baekjoon_java_1_4999;

import java.util.Scanner;

public class Baekjoon_2752 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		sc.close();
		for (int i = 0;i < 3;i++) {
			if (a>b) {
				long d = a;
				a=b;
				b=d;
			}
			else if(a>c) {
				long d = a;
				a=c;
				c=d;
			}
			else if(b>c) {
				long d = b;
				b=c;
				c=d;
			}
		}
		System.out.print(a);
		System.out.print(" ");
		System.out.print(b);
		System.out.print(" ");
		System.out.print(c);
	}

}
