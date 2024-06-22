public class SoftwareDeveloper extends Employee {
    protected Department department;
	protected String projectName;

	public static int getNumber() {
		return number;
	}

	public SoftwareDeveloper(String name, int yearOfSeniority, String projectName, Department department) {
		super(name,yearOfSeniority);
		this.projectName = projectName;
		this.department = department;
	}

	// If yearOfSeniority and projectName are equal, it returns true
	@Override
	public boolean equals(Object obj) {
		SoftwareDeveloper cast = (SoftwareDeveloper) obj;
		return yearOfSeniority == cast.yearOfSeniority && projectName.equals(cast.projectName);
	}

	// Format: [name]@[departmentName]-P:[projectName]-S:[yearOfSeniority] For example: Jim@Android-P:ElectroAndroid-S:7
	@Override
	public String toString() {
		return name + "@" + department.name + "-P:" + projectName + "-S:" + yearOfSeniority;
	}

	//Formula is 2000 +  30 * (yearOfSeniority^2)
	@Override
	public double calculateSalary() {
		return 2000 + 30 * yearOfSeniority * yearOfSeniority;
	}
}
