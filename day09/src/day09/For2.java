package day09;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 10까지의 합을 계싼해서 출력
		int sum=0;
		for(int i=0;i<=10;i++) {
			System.out.printf("i = %d, sum = %d\n",i,sum+=i);
		}
		
		int sum2=0;
		for(int i=0;i<=10;i++) {
			sum2=sum2+i;
		}
		System.out.println(sum);

	}

}
