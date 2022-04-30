package comparatorDemo;

public class Cricketer implements Comparable<Object> {
	String name, country;
	int mat, inns, runs, hs;
	double avg;

	public Cricketer(String name, String country, int mat, int inns, int runs, int hs, double avg) {
		super();
		this.name = name;
		this.country = country;
		this.mat = mat;
		this.inns = inns;
		this.runs = runs;
		this.hs = hs;
		this.avg = avg;
	}

	public String toString() {
		return name + "-" + runs + "-" + avg;
	}

	@Override
	public int compareTo(Object obj) {
		int runs1 = this.runs;
		Cricketer c = (Cricketer) obj;
		int runs2 = c.runs;
		if (runs1 > runs2) {
			return -1;
		} else if (runs1 < runs2) {
			return 1;
		} else {
			return 0;
		}
	}
}
