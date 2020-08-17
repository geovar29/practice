import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Collectionspractice {

	public static void main(String[] args) {
	     
		
		ArrayList abb=new ArrayList();
		
		abb.add(1);
		abb.add(261);
		abb.add(1658);
		abb.add(199);
		abb.add(156);
		abb.add(10);
		abb.add(31);
		abb.add(981);
		abb.add(100);
		
		ArrayList abb1=(ArrayList) abb.clone();
		
		LinkedList ab= new LinkedList(abb1);
		
		ab.
		
		Iterator as=ab.descendingIterator();
		
		while(as.hasNext()) {
			
			System.out.println(as.next());
		}
		
		
		System.out.println(abb1);
		
		Iterator an=abb.iterator();
		
		while(an.hasNext()) {
			
			System.out.println(an.next());
			
		}
		
		
		
		

	}

}
