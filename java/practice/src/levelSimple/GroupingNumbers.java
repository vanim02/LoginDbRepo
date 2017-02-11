package levelSimple;


/*
 * group the numbers into 4 groups based based on the reminder when divided by 4. Perform crud operations on groups.
 *  if a new num is added/updated , add it to the correct group based on reminder
 */
public class GroupingNumbers {

	/**
	 * @param args
	 */
	private static BucketNode head1;
	private static BucketNode head2;
	private static BucketNode head3;
	private static BucketNode head4;
	private static BucketNode currentNode;
	public static void main(String[] args) {
		currentNode=new BucketNode();
		for(int i=0;i<100;i++){
			addNum(i+1);
		}
		
		deleteNum(4);
		printMyLinkedList(head4);
		addNum(101);
		printMyLinkedList(head1);
		addNum(102);
		printMyLinkedList(head2);
		addNum(103);
		printMyLinkedList(head3);
		addNum(104);
		printMyLinkedList(head4);
		deleteNum(101);
		printMyLinkedList(head1);
		updateBucket(2,121);
		printMyLinkedList(head2);
		printMyLinkedList(head1);
		
	}
	private static void addNum(int num){
		//if the bucket is empty, add the num as head. or else add the num at the end
		switch(num%4){
		case 1: 
			if(head1==null){
				head1=new BucketNode();
				addHead(head1, num);
			}else{
				addTail(head1,num);
			}
			break;
		case 2:
			if(head2==null){
				head2=new BucketNode();
				addHead(head2, num);
			}else{
				addTail(head2,num);
			}
			break;
		case 3:
			if(head3==null){
				head3=new BucketNode();
				addHead(head3, num);
			}else{
				addTail(head3,num);
			}
			break;
		case 0:
			if(head4==null){
				head4=new BucketNode();
				addHead(head4, num);
			}else{
				addTail(head4,num);
			}
			break;
		}
	}
	private static BucketNode addHead(BucketNode head,int num){
		head.data = num;
		return head;
	}
	private static void addTail(BucketNode head,int num){
		currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		BucketNode nextNode = new BucketNode();
		nextNode.data = num;
		currentNode.next = nextNode;
	
	}
	
	

	
	private static void printMyLinkedList(BucketNode head) {
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
	
	private static BucketNode deleteHead(BucketNode head) {
		if (head.next == null) {
			head = null;
		} else {
			head = head.next;
		}
		return head;
	}
	
	private static void deleteNum(int num) {
		// If the num to be deleted is in the head node, then delete head. or else delete that particular node
		switch(num%4){
		case 1:	if(head1.data==num){
				head1=deleteHead(head1);
			}else{
				delete(head1,num);
			}
		case 2:
			if(head2.data==num){
				head2=deleteHead(head2);
			}else{
				delete(head2,num);
			}
		case 3:
			if(head3.data==num){
				head3=deleteHead(head3);
			}else{
				delete(head3,num);
			}
		case 0:
			if(head4.data==num){
				head4=deleteHead(head4);
			}else{
				delete(head4,num);
			}
		}
		
	}
	
	private static void delete(BucketNode head,int num){

		currentNode = head;
			while (currentNode.next != null) {
				if(currentNode.next.data==num){
					currentNode.next=currentNode.next.next;
					break;
				}else{
				currentNode = currentNode.next;
				}
			}
		}
	
	
	private static void updateBucket(int num1,int num2){
		//if reminder of both num is same, they both go into same group else num1 is deleted and num2 is added to correct group
		if(num1%4==num2%4){
			switch(num1%4){
			case 1: update(head1,num1,num2);
				break;
			case 2: update(head2,num1,num2);
				break;
			case 3: update(head3,num1,num2);
				break;
			case 0:update(head4,num1,num2);
				break;
			}
		}else{
			deleteNum(num1);
			addNum(num2);
		}
	}
	
	private static void update(BucketNode head,int num1,int num2){
		currentNode=head;
		while(currentNode.next!=null){
			if(currentNode.data==num1){
				currentNode.data=num2;
				break;
			}else{
				currentNode=currentNode.next;
			}
		}
	}
	
}
