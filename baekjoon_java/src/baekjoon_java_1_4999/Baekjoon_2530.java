package baekjoon_java_1_4999;

import java.util.Scanner;

public class Baekjoon_2530 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int second = sc.nextInt();
		int total = sc.nextInt();
		int total_hour = total / 3600;
		int total_minute = (total%3600)/60;
		int total_second = total%60;
		sc.close();
		second+=total_second;
		if(second>=60) {			
			minute+=1;
			second-=60;
		}
		minute+=total_minute;
		if(minute>=60) {
			hour+=1;
			minute-=60;
		}	
		hour+=total_hour;
		while (true) {
			if(hour>=24) {
				hour-=24;
			}
			else break;
		}
		
		System.out.printf("%d ",hour);
		System.out.printf("%d ",minute);
		System.out.printf("%d",second);

	}

}
