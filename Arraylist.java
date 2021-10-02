package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> fruitList = new ArrayList<String>();  
		  
	        fruitList.add("Mango");  
	        fruitList.add("Banana");  
	        fruitList.add("Apple");  
	        fruitList.add("Strawberry");  
	        fruitList.add("Pineapple");  
	  Iterator<String> itr = fruitList.iterator();
	  while(itr.hasNext()) {
		  System.out.println(itr.next());
	  }
		  List<String>immutablelist = Collections.unmodifiableList(fruitList);
		  immutablelist.add("kiwi");
		  System.out.println(fruitList);

	  }
	}



