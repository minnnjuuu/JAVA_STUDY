package day17;

public class Method_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("사각형의 넓이 : "+calculator(10,20));
	}
	static int calculator (int a, int b) {
		System.out.println("<계산을 시작합니다>");
		int area=a*b;
		return area;
	}
}