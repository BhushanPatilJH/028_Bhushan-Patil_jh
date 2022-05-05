class Stack{
	int top1;
	int top2 ;
	int arr[];
	int size = 5;
	Stack(int s){
		this.size = s;
		arr = new int[size];
		top1 = -1;
		top2 = -1;
	}
	void push1(int data){
		if(top1 == (arr.length - 1)){
			return;
		}
		arr[++top1] = data;
	}
	void push2(int data){
		if(top2 == -1){
			top2 = arr.length -1; 
		}else{
		}
		
		arr[top2] = data;
	}
	
	void pop1(){
		if(top1 == -1){
			return;
		}
		int removed = arr[top1];
		top1++;
		System.out.println("Popped element from stack1 is "+removed);
	}
	void pop2(){
		if(top2 == -1){
			return;
		}
		int removed = arr[top2];
		top2--;
		System.out.println("Popped element from stack1 is "+removed);
	}
	public static void main(String[] args){
		Stack s = new Stack(10);
		s.push1(5); 
		s.push2(10); 
		s.push2(15); 
		s.push1(11); 
		s.push2(7); 
		s.push2(40);
		s.pop1();
		s.pop2();
			
	}
}