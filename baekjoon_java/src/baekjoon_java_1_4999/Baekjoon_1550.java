package baekjoon_java_1_4999;
//채점할 때 패키지 지우셈
import java.util.Scanner;

public class Baekjoon_1550 {
//채점할 때 클래스 Main 으로
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1550
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		//문자열 입력받을 때는 sc.next()
		System.out.println(Integer.parseInt(a,16));
		//Integer.parseInt(문자열,a)-> a진법으로 문자열 변환
		sc.close();
		//sc쓰고 닫아줘야함
	}

}
