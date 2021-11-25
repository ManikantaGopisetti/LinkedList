package LinkedList;

public class SortedLinkedList {
	Node head;

	public void insertFirst(int data) {
		Node node = new Node();
		node.setKey(data);
		node.setNext(head);
		head = node;
	}

	public void sortList(int data) {
		Node node = new Node();
		node.setKey(data);
		Node previous = null;
		Node currentNode = head;

		while (currentNode != null && data > currentNode.key) {
			previous = currentNode;
			currentNode = currentNode.next;
		}
		node.next = currentNode;
		if (previous == null)
			head = node;
		else
			previous.next = node;
	}

	public void displaySortedLinkedList() {
		Node currentNode = head;
		System.out.println("SortedLinkedList is : ");
		while (currentNode != null) {
			System.out.print(currentNode.getKey() + "-->");
			currentNode = currentNode.next;
		}
		System.out.println("\n");
	}

}
