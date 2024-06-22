public class Department {
	protected String name;
	protected int numberOfWorker;
	public static int number;

	public String getName() {
		return name;
	}

	public Department(String name, int numberOfEmployee) {
		this.name = name;
		this.numberOfWorker = numberOfEmployee;
		number++;
	}

	// If name and numberOfWorker are equal, it returns true
	@Override
	public boolean equals(Object obj) {
		Department cast = (Department) obj;
		return name.equals(cast.name) && numberOfWorker == cast.numberOfWorker;
	}

	// Format: [name]/[numberOfWorker] For example: Android/number of worker : 30
	@Override
	public String toString() {
		return name + "/number of worker : " + numberOfWorker;
	}
}
