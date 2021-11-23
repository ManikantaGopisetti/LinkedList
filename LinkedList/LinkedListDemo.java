package LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		Node head=null;
		Node node1 = new Node();
		node1.setKey(56);
		node1.setNext(head);
		head=node1;
		Node node2 = new Node();
		node2.setKey(30);
		node2.setNext(head);
		head=node2;
		Node node3 = new Node();
		node3.setKey(70);
		node3.setNext(head);
		head=node3;
		
		Node currentNode=head;
		while(currentNode!=null) {
			System.out.print(currentNode.key+"--->");
			currentNode=currentNode.next;
		}
	}
}
