package labs;

public class Student2 {

	public static void main(String[] args) {
		//create a stud
		StudentDupa stud1 = new StudentDupa("Jane","123251269");
		StudentDupa stud2 = new StudentDupa("bob","123257849");
		StudentDupa stud3 = new StudentDupa("kec","123871269");
		
		stud1.enroll("math");
		stud1.enroll("engk");
	}
	
}
	class StudentDupa{
		//props
		private String name, SSN, email, course = "";
		private static int iD = 000;
		private String userId;
		//private double balance;
		//private ;
		//private ;
		
		public StudentDupa(String name, String SSN ) {
		
			this.name = name;
			this.SSN = SSN;
			iD++;
			setUserId();
			setEmail();
		}
		
		private void setEmail() {
			email = name.toLowerCase() +"."+ iD + "@.com";
			System.out.println("yo email is: "+email);			
		}
		
		private void setUserId() {
			int max = 9000;
			int min = 1000;
			int r_num = (int) (Math.random() * (max-min));
			r_num = r_num + min;
			userId = iD + r_num + SSN.substring(5);
		}
		public void enroll(String course) {
			this.course = course + "\n" + course;
			System.out.println(course);
		}
		public void payTut() {
			
		}
		public void checkBalance() {
			
		}
		public void showCourses() {
			
		}
		public String toString() {
			return null;
		}
		
	}
