package collectionex;

import java.util.ArrayList;

public class UserArrayList {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList<User> userlist=new ArrayList<User>();
	
//	User u1=new User(101, "chandan","midnapur");
//	User u2=new User(102, "chayan","burdwan");
//	User u3=new User(101, "tanmoy","kolkata");
//	
//	userlist.add(u1);
//	userlist.add(u2);
//	userlist.add(u3);
	
	
	//Annonymous object
	userlist.add(new User(101, "chandan","midnapur"));
	userlist.add(new User(102, "chayan","burdwan"));
	userlist.add(new User(101, "tanmoy","kolkata"));
	
	//print the elements
	for (User u:userlist)
	{
		System.out.println("Id: "+u.getId());
		System.out.println("Name: "+u.getName());
		System.out.println("Address: "+u.getAddress());
		System.out.println("=================================");
		
	}
}
}
	
	

