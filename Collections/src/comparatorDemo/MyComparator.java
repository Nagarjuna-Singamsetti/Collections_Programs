package comparatorDemo;

import java.util.Comparator;

public class MyComparator implements Comparator<Object> {

	@Override
	public int compare(Object obj1, Object obj2) {
		Cricketer c1 = (Cricketer) obj1;
		Cricketer c2 = (Cricketer) obj2;
		double I1 = c1.avg;
		double I2 = c2.avg;
		if (I1 > I2) {
			return -1;
		} else if (I1 < I2) {
			return 1;
		} else {
			return 0;
		}

	}

}
