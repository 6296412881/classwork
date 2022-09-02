package collectionex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListEx2 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	ArrayList<String>list2=new ArrayList<String>();
	list2.add("apple");
	list2.add("orange");
	list2.add("banana");
	
	Collections.sort(list2);
	System.out.println("After sorting : "+list2);
	
//	list2.remove(1);
//	list2.remove("kiwi");
	
	list2.set(2, "banana frut");
	System.out.println("after uptadating 2nd position value: "+list2);
	System.out.println(list2.contains("apple"));
	
	System.out.println(list2.contains("apple"));
	
	//converting arraylist to array
	
	String arr[]=new String[list2.size()];
	for(int i=0;i<list2.size();i++)
	{
		arr[i]=list2.get(i);
	}
	System.out.println("arraylist: "+list2);
	System.out.println("Array elements: ");
	for(String s: arr)
	{
		System.out.println(s);
	}
	//convert array to arraylist
	String names[]= {"chandan","pallab","nilanjan","amit"};
	ArrayList<String> alist=new ArrayList<String>(Arrays.asList(names));
	//can add new elements also
	alist.add("shaquib");
	alist.add("islam");
	
	System.out.println("after converting array to arraylist");
	for(String str: alist)
	{
		System.out.println(str);
	}
	
}

}
