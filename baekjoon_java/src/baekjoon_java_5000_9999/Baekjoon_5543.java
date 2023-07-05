package baekjoon_java_5000_9999;

import java.util.Arrays;
import java.util.Scanner;


public class Baekjoon_5543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] burger = new int[3];
		int[] drink = new int[2];
		for (int x=0;x<3;x++) {
			burger[x]=sc.nextInt();
		}
		for(int x=0;x<2;x++) {
			drink[x]=sc.nextInt();
		}
		Arrays.sort(burger);
		Arrays.sort(drink);
		//Arrays.sort(배열) : 배열 정렬
		System.out.println(burger[0]+drink[0]-50);
		sc.close();
	}

}
