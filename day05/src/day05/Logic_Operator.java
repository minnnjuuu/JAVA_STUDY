package day05;

public class Logic_Operator {

	public static void main(String[] args) {
		boolean a=true; //논리형 a변수에 true값 저장
		boolean b=false; //논리형 b변수에 false값 저장
		boolean c=true; //논리형 c변수에 true값 저장
		
		System.out.println(a&&b); //a값과 b 값이 모두 참일 때만 결과가 참 : AND
		System.out.println(a&&c); //a값과 c 값이 모두 참일 때만 결과가 참 : AND
		System.out.println((2<4)&&(4<5)); //true&&true=true
		
		System.out.println(a||b); //a혹은 b가 true라면 결과가 true : OR
		System.out.println(a||c); //a혹은 c가 true라면 결과가 true : OR
		System.out.println(b||b); //false||false == false : OR
		
		System.out.println(!a); //a가 true 면 false, false 면 true

	}

}
