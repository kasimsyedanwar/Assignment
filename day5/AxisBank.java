package week5.day5;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("cash deposited");
	}
	public static void main(String[] args) {
		AxisBank detailsBank = new AxisBank();
		detailsBank.deposit();
	}

}
