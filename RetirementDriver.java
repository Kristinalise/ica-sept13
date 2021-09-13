import java.util.Scanner;

class RetirementDriver{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Are you ready for retirement? Let's find out.");
		
		System.out.println("How much money is currently in your stock portfolio?");
		double assets = Double.parseDouble(in.nextLine());

		System.out.println("What is the expected annual rate of return on your portfolio? The default is 0.07.");
		double rateReturn = Double.parseDouble(in.nextLine());
		
		System.out.println("How old are you?");
		int age = Integer.parseInt(in.nextLine());
		
		System.out.println("What is your yearly salary?");
		double income = Double.parseDouble(in.nextLine());
		
		System.out.println("How much do you contribute every year to retirement?");
		double contr = Double.parseDouble(in.nextLine());
	
		System.out.println("When would you like to retire?");
		int retireAge = Integer.parseInt(in.nextLine());
		
		System.out.println("At what age do you expect to die?");
		int deathAge = Integer.parseInt(in.nextLine());
		
		Portfolio pf = new Portfolio(rateReturn, assets);
		
		RetirementCalculator rc = new RetirementCalculator(pf, income, contr, age, retireAge, deathAge);
		
		rc.readyForRetirement();
		
		in.close();	
	}
}
	