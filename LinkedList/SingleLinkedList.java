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

	public void insertBetween(int first, int value) {
		Node currentNode = head;
		Node temp = null;
		while (currentNode != null) {
			if (currentNode.key == first) {
				temp = currentNode;
			}
			currentNode = currentNode.next;
		}
		Node node = new Node();
		node.setKey(value);
		node.next = temp.next;
		temp.setNext(node);
	}

	public void pop() {
		head = head.next;
	}

	public void popLast() {
		Node currentNode = head;
		Node tail = null;
		while (currentNode.next != null) {
			tail = currentNode;
			currentNode = currentNode.next;
		}
		tail.next = currentNode.next;
	}
}
