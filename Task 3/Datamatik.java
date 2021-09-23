class Datamatik{
	public static void main(String [] args){
		Teacher teach1 = new Teacher("Bob", 43, false);
		Student stu1 = new Student("Christoffer", 21, false, 'a');
		Student stu2 = new Student("Simon", 20, false, 'a');
		System.out.println("Teacher name: "+ teach1.name);
		System.out.println("Student name: "+ stu1.name + " Hold: " + stu2.datamatikerTeam);
		System.out.println("Student name: "+ stu2.name + " Hold: " + stu2.datamatikerTeam);
	}
}