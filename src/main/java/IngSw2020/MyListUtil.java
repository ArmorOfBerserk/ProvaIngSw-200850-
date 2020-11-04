package IngSw2020;

import java.util.Comparator;
import java.util.List;

public class MyListUtil {
	
	public List<Integer> ordinaLista(List<Integer> a, boolean crescente){
		
		if(crescente) {
			a.sort(null);
		}
		
		else
			a.sort(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					return o2.compareTo(o1);
				}
			});
			
		return a;
	}
	
}
