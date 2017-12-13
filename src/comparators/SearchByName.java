package comparators;

import java.util.Comparator;


import model.Aluno;

public class SearchByName implements Comparator<Aluno> {
	
	
	public int compare(Aluno o1, Aluno o2) {
        return o1.getNome().
                compareTo(o2.getNome());
    }

	public int compare2(Aluno o1, Aluno o2) {
		   return o1.getNome().
	                compareTo(o2.getNome());
		
	}


	//@Override
	//public int compare(Aluno o1, Aluno o2) {
	//	if(o1.equals(o2)) {
	//		System.out.println("o nome "+o1.getNome()+" ja contem na lista.");
	//	}
	//	return 0;
	//}
}
