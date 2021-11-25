package LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {

		SingleLinkedList s1 = new SingleLinkedList();
		s1.insertFirst(56);
		s1.append(70);
		s1.insertBetween(56, 30);
		s1.popLast();
		s1.findNode(30);
		s1.insertBetween(30, 40);
		s1.insertBetween(40, 70);
		s1.delete(40);
		s1.displayLinkedList();
<<<<<<< HEAD
=======
		SortedLinkedList sl = new SortedLinkedList();
		sl.sortList(56);
		sl.sortList(30);
		sl.sortList(40);
		sl.sortList(70);
		sl.displaySortedLinkedList();
>>>>>>> 987c53d113972f88d68337830b96e46eefb22515
	}
}
