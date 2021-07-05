package testPack;

public class EmpWageBuilderUC5 {
	public static final int FULL_TIME=1;
	public static final int Part_Time=2;
	public static final int Wage_Hour=20;
	public static final int Working_Days=20;

	public static void main(String[] args) {
		
		int wage=0;
		int hrs=0;
		int Totalwage=0;
		int X=0;
		for(int day=0 ; day<Working_Days ; day++) 
		{
	    int empcheck = (int)Math.floor(Math.random() * 10) %3 ;
		switch((int)empcheck) 
		{
		case Part_Time :
			hrs=5;
			break ;
		case FULL_TIME :
			hrs=10;
			break ;
			default :
				System.out.println("something is wrong");
		}
		wage= hrs * Wage_Hour;
		X= Totalwage + wage;
		System.out.println("Employee wage :" + wage);
		
		}
		System.out.println("Total Employee wage:" + X);

	}

}
