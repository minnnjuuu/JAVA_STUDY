package baekjoon_java_10000_14999;

import java.util.Scanner;

public class Baekjoon_10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int cnt = 0;
		for (int x = 0;x<5;x++) {
			int a = sc.nextInt();
			if (a>=40) {
				cnt+=a;
			}
			else {
				cnt+=40;
			}
		}
		sc.close();
		System.out.println(cnt/5);
	}

}
