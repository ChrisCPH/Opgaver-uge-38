class Main{
	public static void main(String [] args){
		sumOfInts(20, 12);
		returnWithUppercase("Hello");
		checkIfUppercase("Hello");
	}
	public static void sumOfInts(int a, int b){
		int sum = a + b;
		System.out.println(sum);
	}
	public static String returnWithUppercase(String c){
		c = c.toUpperCase();
		System.out.println(c);
		return c;
	}
	public static Boolean checkIfUppercase(String d){
		if(Character.isUpperCase(d.charAt(0))){
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}
	}
}