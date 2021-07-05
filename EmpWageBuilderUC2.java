package testPack;

public class EmpWageBuilderUC2 {

	public static void main(String[] args)
	{
		int IS_FULL_TIME=1;
		int Wage_Hour=20;
		int wage=0;
		int hrs=0;
		double empcheck = Math.floor(Math.random() * 10) %2 ;
		if (empcheck== IS_FULL_TIME)
			hrs=8;
		else
			hrs=0;
			wage= hrs *Wage_Hour;
			System.out.println("Employee wage:" + wage );

	}

}
