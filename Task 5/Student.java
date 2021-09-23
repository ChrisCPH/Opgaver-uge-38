class Student{
	String[] name = {"Olivia","Liam","Noah","Emma","Oliver","Ava","Elijah","Charlotte","William","Sophia"};
	Integer[] age = {20,18,19,16,14,25,27,17,26,23};
	boolean[] isFemale = {true,false,false,true,false,true,false,true,false,true};
	char[] datamatikTeam = {'a','a','b','b','b','a','b','a','a','b'};
	public Student(String[] tmpName, Integer[] tmpAge, boolean[] tmpIsFemale, char[] tmpDatamatikerTeam){
		this.name = tmpName;
		this.age = tmpAge;
		this.isFemale = tmpIsFemale;
		this.datamatikerTeam = tmpDatamatikerTeam;

	}
}