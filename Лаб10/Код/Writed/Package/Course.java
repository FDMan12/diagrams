package Package;

public class Course {
	public String name = "";
	public int id = 0;
	public float hours = 0;
	public String material = "";

	public Course(String name, String id, String hours, String material) {
		this.name = name;
		this.id = id;
		this.hours = hours;
		this.material = material;

		System.out.println("Course created");
	}

	public String toString() {
		return this.name + " " + this.id + " " + this.hours + " " + this.material;
	}

}