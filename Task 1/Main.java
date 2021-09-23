class Main{
	public static void main(String [] args){
		emptyLine();
		stringPrint("Hey");
		nameAge("Christoffer", 21);
	}
	public static void emptyLine(){
		System.out.println();
	}
	public static void stringPrint(String a){
		System.out.println(a);
	}
	public static void nameAge(String name, int age){
		System.out.println("My name is " + name);
		System.out.println("I am " + age + " years old");
	}
	
}