
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
	
	void insertAfterNode(Node prevNode, int data) {
		if(prevNode == null) {
			System.out.println("The previous Node cannot be null");
			return;
		}
		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		
		}
	
	void deleteNode(int data) {
		Node tNode = head;
		if(tNode.val == data) {
			head = tNode.next;
			return;
		}
		while(tNode.next!=null) {
			if(tNode.next.val == data) {
				tNode.next = tNode.next.next;
				return;
			}
		}
		System.out.println("Element with given data does not exist");
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
		list.deleteNode(4);
		list.printList();
		
	}
	
	
	
	
	
}
