package Package;

public class Employee {
	public int ssNo = 0;
	public String name = "";
	public Date birthday = null;
	public String email =  "";
	public int salary = 0;
	public int balance = 0;
	public static int counter = 0;

	public Employee(int ssNo, String name, Date birthday, String email, int salary) {
		this.ssNo = ssNo;
		this.name = name;
		this.birthday = birthday;
		this.email = email;
		this.salary = salary;
		counter++;

		System.out.println("Employee created");
	}
	
	public double age() {
		System.out.println("Age");


		Date currentDate = System.currentDate();
		Date ageDate = currentDate.substract(this.birthday);
		double age = ageDate.getYear() + (ageDate.getMonthDays() + ageDate.getDays()) / 365;
		return age;

		throw new UnsupportedOperationException();
	}

	public void getSalary() {
		System.out.println("Get salary");

		this.balance += this.salary;

		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newSalary
	 */
	public void changeSalary(int newSalary) {
		System.out.println("Change salary");

		this.salary = newSalary;

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.ssNo + " " + this.name + " " + this.birthday + " " + this.email + " " + this.salary + " " + this.balance;
	}

}