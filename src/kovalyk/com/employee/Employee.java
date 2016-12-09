package kovalyk.com.employee;

/** Represents information about employee who works at a company */
public interface Employee {

	/** @return employee's payment for month */
	int calculatePayment();

	/** @return employee id */
	String getEmployeeld();

	/** @return employee's name */
	String getName();
}
