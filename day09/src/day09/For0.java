package day09;

public class For0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1번 컴퓨터 켜줘");
		System.out.println("2번 컴퓨터 켜줘");
		System.out.println("3번 컴퓨터 켜줘");
		System.out.println("4번 컴퓨터 켜줘");
		System.out.println("5번 컴퓨터 켜줘");
		System.out.println("6번 컴퓨터 켜줘");
		System.out.println("7번 컴퓨터 켜줘");
		System.out.println("8번 컴퓨터 켜줘");
		System.out.println("9번 컴퓨터 켜줘");
		System.out.println("10번 컴퓨터 켜줘");
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+"번 컴퓨터 켜줘");
		}
		
		for(int i=1;i<=10;i++) {
			//단, 짝수번호만 컴퓨터 켜줘
			if(i%2==0) {
				System.out.println(i+"번 컴퓨터 켜줘");
			}
		}
		
		for (int i=1;i<=10;i+=2) {
			//단, 홀수 번호만 켜줘
			System.out.println(i+"번 컴퓨터 켜줘");
		}

	}

}
