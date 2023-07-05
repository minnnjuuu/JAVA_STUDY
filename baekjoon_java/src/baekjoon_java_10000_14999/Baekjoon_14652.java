package baekjoon_java_10000_14999;

import java.util.Scanner;

public class Baekjoon_14652 {
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt(); //세로
	int b = sc.nextInt(); //가로
	int c = sc.nextInt(); //번호
	sc.close();
	System.out.print(c/b);
	System.out.print(" ");
	System.out.print(c%b);
	}

}
