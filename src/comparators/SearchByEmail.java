package comparators;

import java.util.Comparator;

import model.Aluno;

public class SearchByEmail implements Comparator<Aluno> {

	@Override
	public int compare(Aluno o1, Aluno o2) {
		if( o1.getEmail().equals(o2.getEmail())) {
	    	   return 0;
	       }
	       return -1;
	    }
}
