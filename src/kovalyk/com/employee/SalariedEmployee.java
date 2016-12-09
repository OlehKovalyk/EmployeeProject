package kovalyk.com.employee;

/**
 * Represents main information about salaried employee
 */
public class SalariedEmployee extends AbstractEmployee {

	private final int hourlyRate;
	private final int amountOfWorkedHours;

	public SalariedEmployee(int hourlyRate, int amountOfWorkedHours, String employeeID, String name) {
		super(employeeID, name);
		this.hourlyRate = hourlyRate;
		this.amountOfWorkedHours = amountOfWorkedHours;
	}

	/**
	 * @return hourly rate
	 */
	public int getHourlyRate() {
		return hourlyRate;
	}

	/**
	 * @return amount of worked hours
	 */
	public int getAmountOfWorkedHours() {
		return amountOfWorkedHours;
	}

	/*
	 * @see softserve.com.employee.Employee#calculatePayment()
	 */
	@Override
	public int calculatePayment() {
		return hourlyRate * amountOfWorkedHours;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SalariedEmployee [hourlyRate=" + hourlyRate + ", numberOfHoursWorked=" + amountOfWorkedHours
				+ ", calculatePay()=" + calculatePayment() + ", getEmployeeld()=" + getEmployeeld() + ", getName()="
				+ getName() + "]";
	}

}
