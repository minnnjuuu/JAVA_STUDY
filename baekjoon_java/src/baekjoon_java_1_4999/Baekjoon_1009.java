package baekjoon_java_1_4999;

import java.util.Scanner;

public class Baekjoon_1009 {

	public static void 	main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a%10==0) {
				System.out.println(10);
			}
			else {
				int one_1 = a%10;
				int one_2 = (one_1*one_1)%10;
				int one_3 = (one_2*one_1)%10;
				int one_4 = (one_3*one_1)%10;
				b = b % 4;
				int one_list[] = {one_4,one_1,one_2,one_3};
				System.out.println(one_list[b]);
			}
		}
		sc.close();
	}

}
