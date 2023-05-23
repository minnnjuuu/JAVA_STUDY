package day20;

public class First_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 = 객체값;
		//클래스명 참조변수 : 클래스명 변수
		ClassA ca=new ClassA();
		System.out.println(ca.x);
		ca.f1();
		ca.x=30;
		System.out.println(ca.x);
	}

}
class ClassA{
	int x=10;
	void f1() {
		System.out.println("f1()");
	}
}