package day12;

public class Array_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3명의 학생 점수를 저장 100점, 80점, 70점
		int score1=100;
		int score2=80;
		int score3=70;
		System.out.println("1번 학생의 점수 : "+score1+"점");
		System.out.println("2번 학생의 점수 : "+score2+"점");
		System.out.println("3번 학생의 점수 : "+score3+"점");

		int scores[]= new int [3];
		scores[0]=100;
		scores[1]=80;
		scores[2]=70;
		System.out.println("1번 학생의 점수 : "+scores[0]+"점");
		System.out.println("2번 학생의 점수 : "+scores[1]+"점");
		System.out.println("3번 학생의 점수 : "+scores[2]+"점");

		for (int i=0;i<3;i++) {
			System.out.println(i+1+"번 학생의 점수 : "+scores[i]+"점");

		}

	}

}
