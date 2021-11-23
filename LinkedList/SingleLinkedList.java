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

	public Node findNode(int data) {
		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.key == data) {
				System.out.println("Node with value " + data + " is : " + currentNode.next);
				return currentNode;
			}
			currentNode = currentNode.next;
		}
		System.out.println("No node found with value " + data);
		return null;
	}

	public void delete(int data) {
		Node currentNode = head;
		Node tail = null;
		while (currentNode.next != null) {
			if (currentNode.key == data) {
				tail.next = currentNode.next;
				return;
			}
			tail = currentNode;
			currentNode = currentNode.next;
		}
		System.out.println("No node found with value" + data);
	}
}
