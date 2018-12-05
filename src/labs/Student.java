package labs;
import java.util.Random;

public class Student {

	public static void main(String[] args) {
		StudentData stud1 = new StudentData("Daniel", "465329874");
		
		stud1.enroll("math");
		stud1.enroll("lit");
		stud1.enroll("hist");
		
		stud1.showCourses();
		stud1.checkBalance();
		stud1.pay(600);
		stud1.checkBalance();
		
		//stud1.setf_Name("Daniel");
		//stud1.setl_Name("Moore");
		//System.out.println(stud1.getName());
		/*stud1.pay(100);
		stud1.checkBalance();
		stud1.setPhone("5682229874");
		System.out.println(stud1.getPhone());
		stud1.setCity("Buford");
		System.out.println(stud1.getCity());
		stud1.setState("Florida");
		System.out.println(stud1.getState());
		System.out.println(stud1.toString());*/
		
		
	}
}


class StudentData {
	//props of a student
	private String f_name;// l_name,full_name;
	private String SSN;
	private String emailID;
	private static int iD = 00;
	private String userID;
	private String courses = "";
	private static final int cost = 800;
	private int balance=0;
	private String phone, city, state;
	
	//Constructor of stud
	public StudentData(String f_name,String SSN) {
		//balance = 40000;
		this.f_name = f_name;
		this.SSN = SSN;
		iD++;
		setUserID();
		setEmailAddress();
	}
	private void setUserID() {
		int max = 9000, min = 1000;
		Random rand = new Random();
		double x = (int)(Math.random() * ((max-min)));
		x = x + min;
		userID = iD +x + SSN.substring(5);
	}
	
	private void setEmailAddress() {
		//int r_num = (int)(Math.random()*1000);
		emailID = f_name.toLowerCase()+"."+iD +"@school.edu";//(f_name.substring(0,3)+(l_name.substring(0,3))); 
		System.out.println("Your Email is: "+emailID);//+r_num+"@school.edu");
	}
	public String getEmaiAddress() {
		return emailID;
	}
	
	/*
	public void setf_Name(String f_name) {
		this.f_name = f_name;
	}
	public void setl_Name(String l_name) {
		this.l_name = l_name;
	}
	public void setName(String full_name) {
		this.full_name = f_name + l_name;
	}
	public String getName() {
		return full_name;
	} */
	public void enroll(String course) {
		this.courses = this.courses +"\n"+course;
		balance = balance + cost;
	}
	public void pay(int amount) {
		balance = balance - amount;
		System.out.println("paying off balance: $"+amount);
		//checkBalance();
	}
	public void checkBalance() {
		System.out.println("Balance: $"+balance);
	}
	public void showCourses(){
		System.out.println(courses);
	}
	
	public void setPhone(String phone) {
		this.phone = phone; 
	}
	public String getPhone() {
		return phone;
	}
	public void setCity(String city) {
		this.city = city; 
	}
	public String getCity() {
		return city;
	}
	public void setState(String state) {
		this.state = state; 
	}
	public String getState() {
		return state;
	}
	
	//@Override
	public String toString() {
		return null;//"(Student Name: "+full_name+ ")\n("+"UserID: "+userID;
	}
	
	}