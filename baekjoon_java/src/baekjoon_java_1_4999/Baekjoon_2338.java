package baekjoon_java_1_4999;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon_2338 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		sc.close();
	}

}
