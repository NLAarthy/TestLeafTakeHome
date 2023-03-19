package w3day1;

public class Students {

	String getStudentInfo() {

		return "No arguments";
	}

	String getStudentInfo(String Name) {

		return "Single argument :" + Name;
	}

	String getStudentInfo(String Name, String id) {

		return "2 string arguments:" + Name + id;
	}

	String getStudentInfo(String Name, String id, String email) {

		return "3 string arguments:" + Name + id + email;
	}

	String getStudentInfo(String Name, String id, String email, int phoneNumber) {
		String phoneNubmer = String.valueOf(phoneNumber);

		return "3 string and 1 int arguments:" + Name + id + email + " " + phoneNubmer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj = new Students();
		String studentInfo = obj.getStudentInfo();
		System.out.println("studentInfo: " + studentInfo);
		studentInfo = obj.getStudentInfo("Aadhitya");
		System.out.println("studentInfo: " + studentInfo);
		studentInfo = obj.getStudentInfo("Aadhitya", "1234");
		System.out.println("studentInfo: " + studentInfo);
		studentInfo = obj.getStudentInfo("Aadhitya", "1234", "aadhi@gmail.com");
		System.out.println("studentInfo: " + studentInfo);
		studentInfo = obj.getStudentInfo("Aadhitya", "1234", "aadhi@gmail.com", 67989878);
		System.out.println("studentInfo: " + studentInfo);
	}

}
