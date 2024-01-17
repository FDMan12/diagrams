package Package;

public class Faculty {
	public Employee dean = null;
	public String name = "";
	public Date dateOfCreation = null;
	public String officeAddress = "";

	public Faculty(Employee dean, String name, Date dateOfCreation, String officeAddress)  {
		this.dean = dean;
		this.name = name;
		this.dateOfCreation = dateOfCreation;
		this.officeAddress = officeAddress;

		System.out.println("Faculty created");
	}

	public double age() {
		System.out.println("Age");

		Date currentDate = System.currentDate();
		Date ageDate = currentDate.substract(this.birthday);
		double age = ageDate.getYear() + (ageDate.getMonthDays() + ageDate.getDays()) / 365;
		return age;

		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newOfficeAdress
	 */
	public void changeOfficeAddress(String newOfficeAddress) {
		System.out.println("Change office address");

		this.officeAddress = newOfficeAddress;

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.dean.toString() + " " + this.name + " " + this.dateOfCreation + " " + this.officeAdress;
	}

}