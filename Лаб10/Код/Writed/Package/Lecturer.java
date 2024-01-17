package Package;

public class Lecturer extends ResearchAssociate {

	/**
	 * 
	 * @param classNumber
	 */

	public Lecturer(int ssNo, String name, Date birthday, String email, int salary) {
		super(ssNo, name, birthday, email, salary);

		System.out.println("Lecturer created");
	}

	public void conductClass(int classNumber) {
		System.out.println("Conduct class");

		String selectedMaterial = cource.material.substring(classNumber * 25, (classNumber + 1) * 25);
		

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.ssNo + " " + this.name + " " + this.birthday + " " + this.email + " " + this.salary + " " + this.balance;
	}

}