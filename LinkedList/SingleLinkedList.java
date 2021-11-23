package LinkedList;

public class SingleLinkedList {
	Node head;

	public void insertFirst(int data) {
		Node node = new Node();
		node.setKey(data);
		node.setNext(head);
		head = node;
	}

	public void displayLinkedList() {
		Node currentNode = head;
		System.out.println("LinkedList is : ");
		while (currentNode != null) {
			System.out.print(currentNode.getKey() + "-->");
			currentNode = currentNode.next;
		}
		System.out.println("\n");
	}

	public void append(int data) {
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		Node node = new Node();
		node.setKey(data);
		currentNode.setNext(node);
	}

}
