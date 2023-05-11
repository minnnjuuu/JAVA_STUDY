package day12;

public class Array_Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ArInt[]=new int[3];
		double ArDouble[]=new double[3];
		char ArChar[]=new char[3];
		String ArString[]=new String[3];
		
		for (int i=0;i<3;i++) {
			System.out.print(ArInt[i]+" ");
		}
		for (int i=0;i<3;i++) {
			System.out.print(ArDouble[i]+" ");
		}
		for (int i=0;i<3;i++) {
			System.out.print(ArChar[i]+" ");
		}
		for (int i=0;i<3;i++) {
			System.out.print(ArString[i]+" ");
		}
	}

}
