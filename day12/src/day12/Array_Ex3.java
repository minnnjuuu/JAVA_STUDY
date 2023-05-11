package day12;

public class Array_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//시험 점수 평균 구하기
		int []students= {100,95,90,88,93};
		int sum=0;
		for(int i=0;i<students.length;i++) {
			sum+=students[i];
		}
		//정수/정수 = 정수, 실수값이 나오려면 정수/실수 를 해줘야 함 
		System.out.println("시험 점수의 평균 : "+sum/(float)students.length);

	}

}
