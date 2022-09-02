package collectionex;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hset=new HashSet<String>();
		
		System.out.println(hset.hashCode());
		
		hset.add("apple");
		hset.add("orange");
		hset.add("kiwi");
		hset.add("banana");
		hset.add("orange");
		hset.add(null);
		
		System.out.println(hset);
		
		Iterator it=hset.iterator();
		
		hset.add("water melon");
		
		while(it.hasNext());
		{
			System.out.println(it.next());
		}

	}

}
