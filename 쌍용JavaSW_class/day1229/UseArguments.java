/*
	메인메소드에 외부값 입력해서 사용ㅎ기
*/
class UseArguments {
	public static void main(String[] args) {
		System.out.println("처음값: "+args[0]);
		System.out.println("다음값: "+args[1]);
		
		System.out.println(args[0]+args[1]); //문자열끼리는 더하기만 가능

		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
				System.out.println(i * j);
		System.out.println(i + j);
		System.out.println(i * j);

		System.out.println("i="+i +", j="+j);
		System.out.println(i>j ? (i+"값이 큽니다"): j+"값이 큽니다.");


	}
}
