package baekjoon_java_10000_14999;

import java.util.Scanner;

public class Baekjoon_10101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a+b+c!=180) {
			System.out.println("Error");
		}
		else {
			if(a==b) {
				if(b==c) {
					System.out.println("Equilateral");
				}
				else if(b!=c) {
					System.out.println("Isosceles");
				}
			}
			else {
				if(b==c) {
					System.out.println("Isosceles");
				}
				else if(a==c) {
					System.out.println("Isosceles");
				}
				else {
					System.out.println("Scalene");
				}
			}
		}
		sc.close();
	}
}
