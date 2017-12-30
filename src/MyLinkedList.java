
public class MyLinkedList {
	Node head;
	
	class Node{
		int val;
		Node next;
		
		Node(int data){
			val = data;
			next = null;
		}
	}
	
	
	void middleElement() {
		Node slowptr = head;
		Node fastptr = head;
		
		if(head!= null) {
			while(fastptr!=null && fastptr.next!= null) {
				slowptr = slowptr.next;
				fastptr = fastptr.next.next;
						
			}
			System.out.println(slowptr.val);
		} else {
			System.out.println("Middle Element does not exist");
		}
	}
	
	void addElement(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	void printList() {
		Node tNode = head;
		while(tNode!=null) {
			System.out.print(tNode.val + "->");
			tNode = tNode.next;
		}
		System.out.print("null");
		System.out.println("");
	}
	
	void addElementAtLast(int data) {
		Node newNode = new Node(data);
		Node tNode = head;
		while(tNode.next!=null) {
			tNode = tNode.next;
		}
		tNode.next = newNode;
		newNode.next = null;
	}
	
	public static void main(String args[]) {
		MyLinkedList list = new MyLinkedList();
		for(int i=0;i<5;i++) {
			list.addElement(i);
			list.printList();
			list.middleElement();
		}
		list.addElementAtLast(100);
		list.printList();
		
	}
	
	
	
	
	
}
