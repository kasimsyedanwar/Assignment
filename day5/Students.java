package week5.day5;

public class Students {
	public void getStudentsInfo(int studId) {
		System.out.println(studId);
	}
	public void getStudentsInfo(int studId,String studName) {
		System.out.print(studId);
		System.out.println(studName);
	}
	public void getStudentsInfo(String studEmail,long studNumber) {
		System.out.println(studEmail);
		System.out.println(studNumber);
	}
	public static void main(String[] args) {
		Students details = new Students();
		details.getStudentsInfo(72153783);
		details.getStudentsInfo(827298,  " kasim syed anwar");
		details.getStudentsInfo("kasimsyedanwar@gmail.com" , 7358085227l);
	}
	
}
