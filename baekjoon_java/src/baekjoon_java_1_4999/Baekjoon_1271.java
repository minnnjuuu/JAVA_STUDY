package baekjoon_java_1_4999;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon_1271 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1271
		Scanner sc= new Scanner(System.in);
		//매우 큰 수 불러올 때는 java.math의 BigInteger 사용
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		System.out.println(a.divide(b));
		System.out.println(a.remainder(b));
	}

}
