package week10;

public class LinkedIntListMain {

	public static void main(String[] args) {
		
		LinkedIntList linkList=new LinkedIntList();
		linkList.add(5);
		linkList.add(7);
		linkList.add(9);
		
		System.out.println(linkList.toString());
		System.out.println(linkList.indexOf(0));
		/*
		System.out.println(linkList.toString());
		linkList.remove(0);
		System.out.println(linkList.toString()); */
		
		linkList.add(0, 11);
		System.out.println(linkList.toString());
		linkList.add(2, 17);
		System.out.println(linkList.toString());
		
		int count = linkList.size();
		System.out.println(count);
		

	}

}
