package kovalyk.com.employee;

/**
 * Represents main information about contract employee
 */
public class ContractEmployee extends AbstractEmployee {

	private final int salary;

	public ContractEmployee(int salary, String employeeId, String name) {
		super(employeeId, name);
		this.salary = salary;
	}
	
	/**
	 * @return salary of contract employee
	 */
	public int getSalary() {
		return salary;
	}

	/*
	 * @see softserve.com.employee.Employee#calculatePayment()
	 */
	@Override
	public int calculatePayment() {
		return salary;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContractEmployee [salary=" + salary + ", calculatePay()=" + calculatePayment() + ", getEmployeeld()="
				+ getEmployeeld() + ", getName()=" + getName() + "]";
	}

}
