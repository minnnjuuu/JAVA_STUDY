package day07;

public class If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=15;
		if(age>19) {
			System.out.println("성인입니다");
			System.out.println("성인 요금이 적용됩니다");
		}
		else { //age<=19
			System.out.println("청소년입니다");
			System.out.println("청소년 요금이 적용됩니다");
		}
		System.out.println("결제를 진행해 주세요");

	}

}
