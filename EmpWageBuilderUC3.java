package testPack;

public class EmpWageBuilderUC3 {

	public static void main(String[] args) {
		int FULL_TIME=1;
		int Part_Time=2;
		int Wage_Hour=20;
		int wage=0;
		int hrs=0;
		double empcheck = Math.floor(Math.random() * 10) %3 ;
		if (empcheck== FULL_TIME)
			hrs=10;
		else if(empcheck== Part_Time)
			hrs=5;
		else
			hrs=0;
			wage= hrs *Wage_Hour;
			System.out.println("Employee wage:" + wage );

		// TODO Auto-generated method stub

	}

}
