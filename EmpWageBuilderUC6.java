package testPack;

public class EmpWageBuilderUC6 {
	public static final int FULL_TIME = 1;
	public static final int Part_Time = 2;
	public static final int Wage_Hour = 20;
	public static final int Working_Days = 20;
	public static final int Max_hours = 100;

	public static void main(String[] args) {
		int empwage = 0;
		int emphrs = 0;
		int Totalwage = 0;
		int X = 0;
		int Y = 0;
		int totalemphrs = 0;
		int totalworkingdays = 0;
		while (totalemphrs <= Max_hours && totalworkingdays <= Working_Days) {
			totalworkingdays++;

			int empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch ((int) empcheck) {
			case Part_Time:
				emphrs = 5;
				break;
			case FULL_TIME:
				emphrs = 10;
				break;
			default:
				emphrs = 0;
				System.out.println("something is wrong");
			}
			Y = totalemphrs + emphrs;
			empwage = emphrs * Wage_Hour;
			X = Totalwage + empwage;
			System.out.println("Employee wage :" + empwage);
		}
		// TODO Auto-generated method stub

	}

}
