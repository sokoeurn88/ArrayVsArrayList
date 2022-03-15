package arrrayvsarraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

	public static void main(String[] args) {
		
		//Arrays size never change or fixed size, can hold primitive data type or objects, can't add element, can't remove the value
		int[] myInArray = new int[4];	//must specify the size
		int[] myInArray1 = {1, 2, 3, 4};
		
		String[] friendsArray = new String[4];
		String[] friendsArray2 = {"sokoeurn", "kosal", "lida", "nitha"};
		
		System.out.println(friendsArray2[0]); 
		System.out.println(friendsArray2.length);
		friendsArray2[3] = "ksatra";
		System.out.println( friendsArray2[3]);
		System.out.println(friendsArray2);	//printing output is pretty useless
		
		System.out.println("*********************************");
		//ArrayList has no fixed size, can hold only objects and generic, but support wrapper type of primitive, can add element, can remove value
		ArrayList<String> friendsArrayList = new ArrayList<String>();
		ArrayList<String> friendArrayList2 = new ArrayList<>(Arrays.asList("Sokoeurn", "kosal", "lida", "nitha", "ksatra"));
		
		System.out.println(friendArrayList2.get(0));
		System.out.println(friendArrayList2.size());
		friendArrayList2.add("davy");
		System.out.println(friendArrayList2.size());
		friendArrayList2.set(4, "saro");
		System.out.println(friendArrayList2.get(4));
		friendArrayList2.remove("lida");
		System.out.println(friendArrayList2.get(2));
		System.out.println(friendArrayList2.size());
		System.out.println(friendArrayList2);	//print output works perfectly
		
		//EXTRA EXAMPLES
		ArrayList<Integer> myInt = new ArrayList<Integer>();
//		ArrayList<Cat> cats = new ArrayList<Cat>();
//		ArrayList<Dog> dogs = new ArrayList<Dog>(5);
		
	}

}
