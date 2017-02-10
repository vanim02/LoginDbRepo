package levelSimple;

public class MyLinkedList {

	/**
	 * @param args
	 */
	private static Node head;
	private static Node currentNode;

	public static void main(String[] args) {
		head = new Node();
		head.data = "1";
		currentNode = head;

		for (int i = 1; i < 5; i++) {
			addTail((i + 1) + "");
		}
		printMyLinkedList();

	/*	String[] data = new String[] { "1", "2", "3", "4", "5" };
		boolean equals = equals(data);
		System.out.println(equals);
	*/	
		addHeadNode("head");
		System.out.println("\n\n\n\n***********add head");
		printMyLinkedList();

		addTail("last");
		System.out.println("\n\n\n\n********add Tail");
		printMyLinkedList();

		addAtIndex("third", 10);
		System.out.println("\n\n\n\n********add  at index");
		printMyLinkedList();

		updateAtIndex("updatedRandomNode", 3);
		System.out.println("\n\n\n\n********Update  at index");
		printMyLinkedList();

		deleteAtindex(3);
		System.out.println("\n\n\n\n********delete at index");
		printMyLinkedList();

		deleteHead();
		System.out.println("\n\n\n\n**********delete head");
		printMyLinkedList();

		deleteTail();
		System.out.println("\n\n\n\n***********delete Tail");
		printMyLinkedList();

		updateHead("headupdated");
		System.out.println("\n\n\n\n***********head updated");
		printMyLinkedList();

		updateTail("lastupdated");
		System.out.println("\n\n\n\n***********Tail updated");
		printMyLinkedList();

		String[] a = new String[] { "a1", "a2", "a3", "a4", "a5" };
		addAll(a);
		System.out.println("\n\n\n\n***********Add all");
		printMyLinkedList();

		addAllAtIndex(a, 3);
		System.out.println("\n\n\n\n***********Add all at index");
		printMyLinkedList();

		clear();
		System.out.println("\n\n\n\n***********Clear list");
		printMyLinkedList();

		boolean contains = contains("a1");
		System.out.println("\n\n\n\n***********contains");
		printMyLinkedList();
	}

	private static void addTail(String data) {
		currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}

		Node nextNode = new Node();
		nextNode.data = data;
		currentNode.next = nextNode;
	}

	private static void addHeadNode(String data) {
		Node newHead = new Node();
		newHead.data = data;
		newHead.next = head;
		head = newHead;
	}

	private static void addAtIndex(String data, int index) {
		currentNode = head;
		int count = 1;

		if (index == 1) {
			addHeadNode(data);
		} else {
			while (currentNode.next != null && count < index - 1) {
				currentNode = currentNode.next;
				count++;
			}
			Node newNode = new Node();
			newNode.data = data;
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
	}

	private static void deleteHead() {
		if (head.next == null) {
			head = null;
		} else {
			head = head.next;
		}
	}

	private static void deleteTail() {
		currentNode = head;
		if (head.next == null) {
			head = null;
		} else if (head.next.next == null) {
			head.next = null;
		} else {
			while (currentNode.next.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = null;
		}
	}

	private static void deleteAtindex(int index) {
		currentNode = head;
		int count = 1;
		if (index == 1) {
			deleteHead();
		} else {
			while (currentNode.next != null && count < index) {
				count++;
				currentNode = currentNode.next;
			}
		}
		currentNode.next = currentNode.next.next;
	}

	private static void printMyLinkedList() {
		currentNode = head;
		if (currentNode == null) {
			System.out.println("empty list");
		} else {
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}

	private static void updateHead(String data) {
		head.data = data;
	}

	private static void updateTail(String data) {
		currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.data = data;
	}

	private static void updateAtIndex(String data, int index) {
		currentNode = head;
		int count = 1;
		if (index == 1) {
			updateHead(data);
		} else {
			while (currentNode.next != null && count < index) {
				count++;
				currentNode = currentNode.next;
			}
			currentNode.data = data;
		}

	}

	private static void addAll(String[] data) {
		for (int i = 0; i < data.length; i++) {
			addTail(data[i]);
		}
	}

	private static void addAllAtIndex(String[] data, int index) {
		for (int i = 0; i < data.length; i++) {
			addAtIndex(data[i], index);
			index++;
		}
	}

	private static void clear() {
		head = null;
	}

	private static boolean contains(String data) {
		boolean exists = false;
		currentNode = head;
		if (currentNode == null) {
			System.out.println("empty list");
		} else {
			while (currentNode.next != null) {
				if (currentNode.data.equals("data")) {
					exists = true;
					break;
				} else {
					currentNode = currentNode.next;
				}
			}
			if (currentNode.data.equals("data")) {
				exists = true;
			}
		}
		return exists;
	}

/*	private static boolean equals(String[] data) {
		boolean equal = false;
		currentNode = head;
		if (head == null) {
			System.out.println("empty list");
		} else {
			int i=0;
			int count = 1;
			while (currentNode.next != null && i<data.length) {
				if (currentNode.data.equals(data[i])){
					currentNode = currentNode.next;
				} else {
					return equal;
				}
				i++;
				count++;
				currentNode = currentNode.next;
			}
			if(count==data.length)
				equal=true;
		}
		return equal;
	}*/
}
