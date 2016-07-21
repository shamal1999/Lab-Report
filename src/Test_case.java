import java.util.Scanner;

public class Test_case {
	
public static void main(String args[]){
	double hoursWorked = 0;
	double hourlyPayRate;
	double hourlyPay=0;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of hours worked");
	hoursWorked= input.nextDouble();
	if (hoursWorked<39)
		hourlyPay=9.25;
		else if (hoursWorked<40)
			hourlyPay=10.5;
			else if(hoursWorked<41)
				hourlyPay=11;
				else if(hoursWorked>=41)
					hourlyPay=10;
	hourlyPayRate=hourlyPay;
	Test_case tc = new Test_case();
	System.out.println("Gross Pay = " + tc.calcGross(hourlyPayRate,hoursWorked));
	
	
	System.out.println("Taxes = " + tc.calctaxes(hourlyPayRate,hoursWorked));
	System.out.println("Net Pay = " + tc.calcNet(hourlyPayRate,hoursWorked,hourlyPay));
}

public  double calcGross(double hourlyPayRate, double hoursWorked){ 
	double grossPay = hourlyPayRate*hoursWorked;
	return grossPay;
}
public double calctaxes(double hourlyPayRate, double hoursWorked){
    double taxes = calcGross(hoursWorked,hourlyPayRate) * 0.3;
    return taxes;
}
public double calcNet(double hourlyPayRate, double hoursWorked, double taxes){
	double netPay = calcGross(hoursWorked,hourlyPayRate) - calctaxes(hoursWorked,hourlyPayRate);
	return netPay;
}
}
