package Package;

public class AdministrativeEmployee extends Employee {

	public AdministrativeEmployee(int ssNo, String name, Date birthday, String email, int salary) {
		super(ssNo, name, birthday, email, salary);

		System.out.println("Administative employee created");
	}

	/**
	 * 
	 * @param employee
	 */

	public void paySalary(Employee employee) {
		System.out.println("Pay salary");

		employee.getSalary();

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.ssNo + " " + this.name + " " + this.birthday + " " + this.email + " " + this.salary + " " + this.balance;
	}

}