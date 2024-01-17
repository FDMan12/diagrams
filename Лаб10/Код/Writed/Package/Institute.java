package Package;

public class Institute {
	public String name = "";
	public Date dateOfCreation = null;
	public String address = "";
	public List<ResearchAssociate> researchAssociates = new ArrayList<>();

	public Institute(String name, Date dateOfCreation, String address) {
		this.name = name;
		this.dateOfCreation = dateOfCreation;
		this.address = address;

		System.out.println("Institute created");
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
	 * @param newAdress
	 */
	public void changeAddress(String newAddress) {
		System.out.println("Change address");

		this.address = newAddress;

		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param researchAssociate
	 */
	public void addResearchAssociate(ResearchAssociate researchAssociate) {
		System.out.println("Add research associate");

		if (!this.researchAssociates.contains(researchAssociate)) {
			this.researchAssociates.add(researchAssociate);
		}

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.name + " " + this.dateOfCreation + " " + this.adress + " " + this.researchAssociates.forEach().toString().append(" ");
	}

}