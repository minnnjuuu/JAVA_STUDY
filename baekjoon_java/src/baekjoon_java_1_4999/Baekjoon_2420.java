package baekjoon_java_1_4999;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon_2420 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		System.out.println(a.subtract(b).abs());
		sc.close();
	}
}
