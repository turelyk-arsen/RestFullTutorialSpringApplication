package payroll;

public class EmployeeNotFoundExeption extends RuntimeException {
	
	EmployeeNotFoundExeption(Long id) {
		super("Could not find employee " + id);
	}
}
