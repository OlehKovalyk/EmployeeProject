package kovalyk.com.employee;

/** Abstract realization of common employee behaviour  */
public abstract class AbstractEmployee implements Employee {
	private final String employeeld;
	private final String name;

	public AbstractEmployee(String employeeld, String name) {
		this.employeeld = employeeld;
		this.name = name;
	}

	/* @see softserve.com.employee.Employee#getEmployeeld() */
	@Override
	public String getEmployeeld() {
		return employeeld;
	}

	/* @see softserve.com.employee.Employee#getName() */
	@Override
	public String getName() {
		return name;
	}

}
