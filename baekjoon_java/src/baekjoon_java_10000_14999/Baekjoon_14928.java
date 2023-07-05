package baekjoon_java_10000_14999;

import java.util.Scanner;

public class Baekjoon_14928 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		long rest = 0;
		sc.close();
        for (int i = 0; i < input.length(); i++) {
            rest =(rest * 10 + (input.charAt(i) - '0')) % 20000303;
        }
        //뭔가 이해는 가지 않지만 대입을 해보니 알듯말듯...
		System.out.println(rest);
	}
}
