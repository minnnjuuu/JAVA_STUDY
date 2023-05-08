package day04;

public class Plus_Minus_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1; //a변수에 1값 저장
		System.out.println(a);
		
		a++; //a값 1증가 : 후위형
		System.out.println(a); //이떄, a는 2
		System.out.println(++a);  //a의 값 1 증가, 전위형 : 증가가 먼저 a:3
		System.out.println(a++);  //a의 값 1 증가, 후위형 : 증가가 나중에 출력 a:3
		System.out.println(a);    //12line 에서 a값이 증가되었으므로 출력 : 4
	}

}
