package practice_tasks.java_day03_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourlyRate = 50,
                stateTaxRate = 6,
                federalTaxRate = 26,
                weeksInAYear = 52;
        int weeklyHours = 45;

        double grossPay = hourlyRate*weeklyHours*weeksInAYear,
                federalTax = grossPay*federalTaxRate/100,
                stateTax = grossPay*stateTaxRate/100,
                totalTax = federalTax+stateTax,
                netIncome = grossPay-totalTax;



        /*
        System.out.println("Gross pay is: $" + grossPay);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: " + totalTax);
        System.out.println("Net income is: $" + netIncome);
        */
        System.out.println("Gross pay is: $" + grossPay + "\nFederal tax is: $" + federalTax + "" +
                "\nState tax is: $" + stateTax + "\nTotal tax is: $" + totalTax + "\nNet income is: $" + netIncome);




    }
}

/*
4. Create a class named SalaryCalculator. Given the following variables:
				hourlyRate (double)
				weeklyHours (int)
				stateTaxRate (double)
				federalTaxRate (double)

	Use the given information above to calculate the following:
				salaryBeforeTax (Yearly salary before tax)
				stateTax (Yearly state tax)
				federalTax (Yearly federal tax)
				totalTax (yearly total tax)
				salaryAfterTax (Yearly salary after tax)

		Assume that there are 52 work weeks in a year.

	Display each of the above in the following format:

					Example:
						hourlyRate = $50
						weeklyHours = 45
						stateTaxRate = 6  (given as a percentage)
						federalTaxRate = 26 (given as a percentage)

					Output:
						Gross pay is: $117000.0
						Federal tax is: $30420.0
						State tax is: $7020.0
						Total tax is: $37440.0
						Net income is: $79560.0

 */