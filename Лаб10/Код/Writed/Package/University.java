package Package;

public class University {

	public Employee rector = null;
	public String name = "";
	public Date dateOfCreation = null;
	public String mainOfficeAddress = "";

	public University(Employee rector, String name, Date dateOfCreation, String mainOfficeAddress) {
		this.rector = rector;
		this.name = name;
		this.dateOfCreation = dateOfCreation;
		this.mainOfficeAddress = mainOfficeAddress;

		System.out.println("University created");
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
		return this.rector + " " + this.name + " " + this.dateOfCreation + " " + this.mainOfficeAdress;
	}

}