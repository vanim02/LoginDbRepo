package levelSimple;

public class DoublyLinkedList {

	/**
	 * @param args
	 */
	private static Dnode head;
	private static Dnode currentNode;

	public static void main(String[] args) {
		head = new Dnode();
		head.data = "head";
		head.prev = null;
		head.next = null;

		System.out.println("++++++++++");
		addHead("addhead");
		printMyList();
		System.out.println("++++++++++");
		addTail("addtail");
		printMyList();
		System.out.println("++++++++++");
		addHead("head2");
		printMyList();
		System.out.println("++++++++++");
		addTail("tail");
		printMyList();
		System.out.println("++++++++++");
		addAtIndex("third", 3);
		printMyList();
		System.out.println("++++++++++");
		deleteAtIndex(3);
		printMyList();
		System.out.println("++++++++++");
		deleteTail();
		printMyList();
		System.out.println("++++++++++");
		printFromTail();
		System.out.println("++++++++++");
		updateHead("updatedhead");
		printMyList();
		System.out.println("++++++++++");
		updateTail("updatedtail");
		printMyList();
		System.out.println("++++++++++");
		updateAtIndex("updatethird", 3);
		printMyList();
		System.out.println("++++++++++");
		updateAtIndex("1", 1);
		printMyList();
		System.out.println("++++++++++");
		updateAtIndex("10", 10);
		printMyList();
	}

	private static void addHead(String data) {
		Dnode newHead = new Dnode();
		newHead.data = data;
		newHead.prev = null;
		newHead.next = head;
		head.prev = newHead;
		head = newHead;
	}

	private static void addTail(String data) {
		currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		Dnode newTail = new Dnode();
		currentNode.next = newTail;
		newTail.data = data;
		newTail.prev = currentNode;
		newTail.next = null;
	}

	private static void printMyList() {
		currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	private static void addAtIndex(String data, int index) {
		currentNode=head;
		int count = 1;
		if (index == 1) {
			addHead(data);
		} else {
			while (currentNode.next != null && count < index - 1) {
				count++;
				currentNode = currentNode.next;
			}
			Dnode newNode = new Dnode();
			newNode.data = data;
			newNode.prev = currentNode;
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}

	}

	public static void deleteHead() {
		if (head.next == null) {
			head = null;
		} else {
			head = head.next;
		}
	}

	public static void deleteTail() {
		currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode = currentNode.prev;
		currentNode.next = null;
	}

	public static void deleteAtIndex(int index) {
		currentNode = head;
		int count = 1;
		while (currentNode.next != null && count < index-1) {
			currentNode = currentNode.next;
			count++;
		}
		
		currentNode.next = currentNode.next.next;
		currentNode.next.prev=currentNode;
	}
	
	public static void printFromTail(){
		currentNode=head;
		while(currentNode.next!=null){
			currentNode=currentNode.next;
		}
		while(currentNode.prev!=null){
			System.out.println(currentNode.data);	
			currentNode=currentNode.prev;
		}
		System.out.println(currentNode.data);
	}
	
	public static void updateHead(String data){
		currentNode=head;
		currentNode.data=data;
	}
	
	public static void updateTail(String data){
		currentNode=head;
		while(currentNode.next!=null){
			currentNode=currentNode.next;
		}
		currentNode.data=data;
	}
	public static void updateAtIndex(String data,int index){
		currentNode=head;
		int count=1;
		if(index==1){
			updateHead(data);
		}else{
			while(currentNode.next!=null && count<index){
				currentNode=currentNode.next;
				count++;
			}
			currentNode.data=data;
		}
	}
	

}
