package day18;

public class OverLoad_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(10,20);
		sum(1.23,3.14);
		sum(10,20,30);
	}
	//메서드의 매개변수 타입에 변환
	//두개의 정수 입력받아 합을 출력하는 함수
	static void sum(int x,int y) {
		System.out.println(x+y);
	}
	//두개의 실수 입력받아 합을 출력하는 함수
	static void sum(double x, double y) {
		System.out.println(x+y);
	}
	//메서드의 매개변수 갯수에 변환
	static void sum(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	
}
