import java.util.*;
class LinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			next = null;
			}
	}
	
	void insert(int data) {
		Node newNode = new Node(data);
		
		Node n = head;
		if(head == null){
			head = newNode;
			return;
		}
		while( n.next != null){
			n = n.next;
		}
		n.next = newNode;	
	}
	void reverse(Node head){
		Node m = head;
		Node n = head;
		if(head == null){
			return;
		}
		/*while(n.next != null){
			while(m.next != null){
			m = m.next;
			n = m.next;
			m.next = head;
			
			m = n;
			
			}
		head = m;	
		}		
		*/
		
		if(n == null){
			return ;
		}
		reverse(n.next);
		System.out.print(n.data+" ");
	}
	
	// void display(){
		// if(head == null){
			// System.out.println("list is empty");
			// return;
		// }
		// Node n = head;
		// while(n.next != null){
			// System.out.print(n.data+" ");
			// n = n.next;
		// }
		// System.out.println();
	// }
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		LinkedList l = new LinkedList();
		int testCase = 1;
		
		while(testCase != 3){
			l.head = null;
			System.out.println("TestCase: "+testCase);
			int n = sc.nextInt();
			for(int i = 1 ; i <= n; i++ ){
				l.insert(sc.nextInt());
			}	
			
			l.reverse(l.head);
			testCase++;
			System.out.println();
			//l.display();
		}
		
	}
}