class TestPromotion{
	public static void main(String[] args) 
	{
		//자동 형변환 : int의 하위 데이터 형이 연산되면 자동으로 int에 저장되어 반환
		byte num1 = 10;
		byte num2 = 20;
		int result = num1+num2; //자동 형변환

		System.out.println(num1 + " + "+num2+" = "+ result);
		
		byte result1 = (byte)(num1+num2);
		System.out.println(num1 + " + "+num2+" = "+ result1);

	}
}
