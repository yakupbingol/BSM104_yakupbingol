package week9;

public class LinkedMain {

	public static void main(String[] args) {
		ListNode list = new ListNode();
		list.data=7;
		list.next=new ListNode();
		list.next.data=9;
		list.next.next=new ListNode();
		list.next.next.data=13;
		list.next.next.next=null;
		System.out.println(list.data + " " + list.next.data +  " " + list.next.next.data);

	}

}
