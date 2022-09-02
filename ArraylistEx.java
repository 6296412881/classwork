package collectionex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistEx {
	public static void main(String[] args) {
		//object using polymorphism
		List<Integer>list=new ArrayList<Integer>();
		
		//ArrayList<String> list2=new ArrayList<String>();
		
		list.add(34);
		list.add(56);
		list.add(34);
		list.add(45);
	//	list.add(null);
		System.out.println(list);
		System.out.println(list.size());
		list.add(77);
		list.add(99);
		System.out.println("After adding: " +list);
		System.out.println("size after adding: "+list.size());
	
	   //sort arraylist
		Collections.sort(list);
		System.out.println("After sorting the values are:");
		System.out.println(list);
		
		//sort arraylist in ascending order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("after sorting in descending order the value are:");
		System.out.println(list);
		
		list.add(2,100);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		//copy all arraylist to another
		ArrayList<Integer>des=new ArrayList<Integer>();
		des.addAll(list);
		System.out.println("Copy list: "+ des);
		
		//storing the sublist
		List<Integer>sublist1=list.subList(2, 4);
		
		System.out.println(sublist1);
		
		//another way
		ArrayList<Integer>sublist2=new ArrayList<Integer>(list.subList(1, 3));
		System.out.println(sublist2);
		
		//search
		System.out.println(list.contains(34));
		list.clear();
		System.out.println(list);
	}

}



