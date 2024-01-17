package Package;

public class Project {
	public String name = "";
	public Date start = null;
	public Date end = null;
	public List<String> reports = new ArrayList<>();

	public Project(String name, Date start, Date end) {
		this.name = name;
		this.start = start;
		this.end = end;

		System.out.println("Project created");
	}

	public double duration() {
		System.out.println("Duration");

		Date currentDate = System.currentDate();
		Date durationDate = currentDate.substract(this.birthday);
		double duration = durationDate.getYear() + (durationDate.getMonthDays() + durationDate.getDays()) / 365;
		return duration;

		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param researchAssociate
	 */
	public void createReport(ResearchAssociate researchAssociate) {
		System.out.println("Create report");

		String newReport = "";
		

		newReport += "\n [" + researchAssociate.name + "]";
		reports.add(newReport);

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.name + " " + this.start + " " + this.end + " " + this.reports.forEach().append(" ");
	}

}