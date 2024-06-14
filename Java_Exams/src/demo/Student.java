package demo;

//public class Student {
//
//	public Student() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
public class Student{
	 int id;
	 int roll_no;
	 String name;	
	
	Student(int i, String s){
	id = i;
	name = s;
	}
	Student(int i, String s, int r){
	id = i;
	name = s;
	roll_no = r;
	}
	void display(){
		System.out.println(id +" " + name +" " + roll_no);
	}
	public static void main (String ar[]){
		Student s1 = new Student(1, "A");
		Student s2 = new Student(2, "B", 201);
		System.out.println(s1.id + s1.name );
		System.out.println(s2.id + s2.name  + s2.roll_no);
	       }
	
	

}
//public class main 
//{
//	
//}
	
