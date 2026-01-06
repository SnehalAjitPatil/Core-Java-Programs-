package TreeSetComparator;

import java.util.Comparator;

public class TreesetEmpidAsComparator implements Comparator{
	@Override
	public int compare(Object emp1, Object emp2) {
		Employee e1=(Employee)emp1;
		Employee e2=(Employee)emp2;
		if(e1.getEmpid() > e2.getEmpid())
			return 1;
		else if(e1.getEmpid() < e2.getEmpid())
			return -1;
		else
			return 0;
	}

}
