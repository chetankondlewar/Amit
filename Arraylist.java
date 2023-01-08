package CollectionAlgo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arraylist {

	private static Iterator<Integer> iterator;
	private static ListIterator<Integer> listIterator;

	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(40);
		
		List<Integer> list1=new ArrayList<>(list);
		list1.add(50);
		list1.add(30);
		list1.add(70);
		list1.add(80);
		list1.add(40);
		
		System.out.println(list1);
		
		list1.add(2, 100);
		System.out.println(list1);
		list1.addAll(list);
		System.out.println(list1);
		//list1.clear();
		//System.out.println(list1); // its clear all the objects means elements
		
		System.out.println(list1.contains(100)); // check given elements present or not
		
		System.out.println(list1.equals(list));  // check equality
		System.out.println(list1.indexOf(100));   // index of given no
		System.out.println(list1.lastIndexOf(50));  // find the last index
		System.out.println(list1.isEmpty());  // check given list is empty or not true or false
		
		System.out.println(list1.remove(2));  // remove elements bur we have to provide index of elements
		System.out.println(list1);
//		list.removeAll(list1);
//		System.out.println(list);
		System.out.println(list1.get(3));  // get elements by the index
		list1.set(2, 100);
		System.out.println(list1);
		
		Iterator itr= list1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		ListIterator lit= list1.listIterator();
		while(lit.hasPrevious())
			System.out.print(lit.previous()+" ");
		
	}

}
