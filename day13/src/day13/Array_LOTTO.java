package day13;

//java.util패키지에 있는 모든 클래스 import
import java.util.*;
public class Array_LOTTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int lottoAr[]=new int [6];
		int userAr[]=new int [6];
		int bonus, bonusUser;
		int count =0;
		
		//6개의 랜덤의 숫자와 보너스 점수를 로또 배열에 저장
		for(int i=0;i<6;i++)
			lottoAr[i]=random.nextInt(45)+1;
		//bonus=random
		bonus=random.nextInt(45)+1;
		
		//로또 번호 미리 출력
		System.out.println("LOTTO :"+Arrays.toString(lottoAr)+",bonus : "+bonus);
		
		
		//사용자에게 6개의 정수와 보너스 정수 입력받기
		System.out.print("숫자 6개 입력 : ");
		for(int i=0;i<6;i++)
			userAr[i]=sc.nextInt();
		System.out.print("보너스 값 입력 :");
		bonusUser=sc.nextInt();
		
		//로또 배열의 값과 사용자 배열의 값 중 같은 값이 몇개 있는지 카운팅
		for(int i=0;i<6;i++) {
			for(int x=0;x<6;x++) {
				if(lottoAr[i]==userAr[x])
					count++;
			}
		}
		
		System.out.println("LOTTO :"+Arrays.toString(userAr)+",bonus : "+bonusUser);
		System.out.println("총 맞춘 갯수 : "+count);

		//count의 개수에 따라서 등수 정하기
		if(count==6)
			System.out.println("축하드립니다! 1등입니다!");
		else if(count ==5) {
			if(bonus==bonusUser)
				System.out.println("축하드립니다! 2등입니다");
			else 
				System.out.println("축하드립니다! 3등입니다");
		}
		else if (count==4)
			System.out.println("축하드립니다! 4등입니다");
		else if (count==3) 
			System.out.println("축하드립니다! 5등입니다");
		else 
			System.out.println("아쉽지만 다음기회에....");

	}

}
