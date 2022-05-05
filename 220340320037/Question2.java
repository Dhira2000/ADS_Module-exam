class Question2{

	static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	public static void reverse(Node head){
		
		//Node p=head;
		if(head.next!=null){
			reverse(head.next);
		}
		System.out.print(head.data+"->");
		
	}
	void display(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
	public static void main(String[]args){
		Question2 q2 = new Question2();
		
		q2.head = new Node(1);
		Node h2 = new Node(2);
		Node h3 = new Node(3);
		
		q2.head.next = h2;
		h2.next = h3;
		
		q2.display();
		System.out.println();
		q2.reverse(head);
		
	}
}