/*
	<<: Left Shift
	>>: Right Shift
	>>>: unsighed right shift  - 비트를 오른쪽으로 밀고, 밀어서 빈칸을 0으로 채움
*/
class Operator3 {
	public static void main(String[] args) {
		
		int i = 6; //0000 0110
		System.out.println(i+ "<<3 : "+ (i<<3)); //48 :  0011 0000
		
		i=1;
		System.out.println(i+ "<<31 : "+ (i<<31)); //-2147483648 
		
//		80 : 0101 0000
		i= 37; //100101
		/*
		기본형 데이터형은 값만 사용할 수있지만, 
		Wrapper클래스는 값 이외에 여러가지 기능(일:Method)사용할수 있다
		
		System.out.println("2진수 : "+ Integer.toBinaryString(i)); // 100101
		System.out.println("16진수: "+ Integer.toHexString(i)); //25
		System.out.println("8진수: "+Integer.toOctalString(i)); //45
		*/


		System.out.println(i+ ">>3 : "+ (i>>3)); // 4: 100 

		i=-1;
//		System.out.println("2진수 : "+ Integer.toBinaryString(i)); // 1111 1111 1111 1111
		System.out.println(i>>100); //-1


// Unsigned right
		
		//음수를 저장하지않는 right 시프트
		i = 15;
		System.out.println(i>>>3);

		i = 45;	// 0010 1101
		System.out.println(i>>>2); // 11: 0000 1011 

		i = -1; // 
		long n=i>>>1;
		System.out.println(n);		
		

	}
}
