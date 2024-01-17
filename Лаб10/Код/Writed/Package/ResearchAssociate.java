package Package;

public class ResearchAssociate extends Employee {
	public String fieldOfStudy = "";

	public ResearchAssociate(int ssNo, String name, Date birthday, String email, int salary, String fieldOfStudy) {
		super(ssNo, name, birthday, email, salary);
		this.fieldOfStudy = fieldOfStudy;

		System.out.println("Research associate created");
	}

	public startProject(Project project) {
		System.out.println("Project start");

		this.project = project;
		Participation participation = new Participation();
	}

	public String toString() {
		return this.ssNo + " " + this.name + " " + this.birthday + " " + this.email + " " + this.salary + " " + this.balance + " " + this.fieldOfStudy;
	}

}