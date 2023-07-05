package baekjoon_java_15000_19999;

import java.util.Scanner;

public class Baekjoon_15727 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		sc.close();
		if(a%5==0) {
			System.out.println(a/5);
		}
		else {
		System.out.println(a/5+1);
		}
	}

}
